package com.eservice.s1auto.input;

import lombok.Getter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class StandardConfig {
    @Getter
    private final String apiVersion = "2021-03-22";

    @Getter
    private final String channel = "CNP";

    @Getter
    private final String captureMode = "AUTO";

    @Getter
    private final String defaultCurrency = "PLN";

    @Getter
    private final String providerServerTransRef = "vJ9NXpFueXsAqeb4iAbJJbe+66s=";

    @Getter
    private final String authenticationValue = "AAACBUGDZYYYIgGFGYNlAAAAAAA=";

    @Getter
    private final String eci = "05";

    @Getter
    private final String messageVersion = "2.1.0";
}
