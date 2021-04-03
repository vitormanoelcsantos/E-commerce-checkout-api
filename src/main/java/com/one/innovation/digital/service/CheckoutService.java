package com.one.innovation.digital.service;

import com.one.innovation.digital.entity.CheckoutEntity;
import com.one.innovation.digital.resource.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}