package com.one.innovation.digital.listener;

import com.one.innovation.digital.entity.CheckoutEntity;
import com.one.innovation.digital.event.PaymentCreatedEvent;
import com.one.innovation.digital.service.CheckoutService;
import com.one.innovation.digital.streaming.PaymentPaidSink;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentPaidListener {

    private final CheckoutService checkoutService;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent paymentCreatedEvent) {
        checkoutService.updateStatus(paymentCreatedEvent.getCheckoutCode().toString(), CheckoutEntity.Status.APPROVED);
    }
}