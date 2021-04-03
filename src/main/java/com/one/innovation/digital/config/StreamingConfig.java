package com.one.innovation.digital.config;

import com.one.innovation.digital.streaming.CheckoutCreatedSource;
import com.one.innovation.digital.streaming.PaymentPaidSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class,
        PaymentPaidSink.class
})
public class StreamingConfig {
}