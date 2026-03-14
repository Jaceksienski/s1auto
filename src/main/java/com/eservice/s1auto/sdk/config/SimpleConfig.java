package com.eservice.s1auto.sdk.config;

import com.eservice.s1auto.logs.LoggerBuilder;
import com.global.api.entities.enums.Channel;
import com.global.api.entities.enums.Environment;
import com.global.api.logging.IRequestLogger;
import com.global.api.logging.RequestFileLogger;
import com.global.api.serviceConfigs.GpApiConfig;

import java.io.IOException;

public class SimpleConfig implements IRequestLogger {

    void init() {
        GpApiConfig config = new GpApiConfig();
        config.setAppId("i9R0byBBor6RqTQNj3g4MuVBwH5rd7yR");
        config.setAppKey("QVefNGo6bkMcjveA");
        config.setChannel(Channel.valueOf(Channel.CardNotPresent.getValue()));
        config.setEnvironment(Environment.TEST);
        config.setChallengeNotificationUrl("https://www.example.com/challengeNotificationUrl");
        config.setMethodNotificationUrl("https://www.example.com/methodNotificationUrl");
        config.setMerchantContactUrl("https://www.example.com/about");
        config.setRequestLogger(new RequestFileLogger("logs.txt"));
    }

    @Override
    public void RequestSent(String s) throws IOException {
        LoggerBuilder.addToLogs(s);
    }

    @Override
    public void ResponseReceived(String s) throws IOException {
        LoggerBuilder.addToLogs(s);
    }
}
