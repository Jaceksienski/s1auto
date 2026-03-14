package com.eservice.s1auto.input;

import lombok.Getter;
import lombok.experimental.UtilityClass;

@UtilityClass
@Getter
public class StandardConfig {
    private final String apiVersion = "2021-03-22";
    private final String channel = "CNP";
    private final String captureMode = "AUTO";
    private final String defaultCurrency = "PLN";
}
