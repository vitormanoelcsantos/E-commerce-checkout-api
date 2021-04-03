package com.one.innovation.digital.util;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UUIDUtil {

    public UUID createUUID() {

        return UUID.randomUUID();
    }
}