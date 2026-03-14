package com.eservice.s1auto.sdk.config;

import com.eservice.s1auto.input.TestData;
import com.eservice.s1auto.logs.LoggerBuilder;
import com.global.api.entities.enums.Channel;
import com.global.api.entities.enums.Environment;
import com.global.api.logging.IRequestLogger;
import com.global.api.logging.RequestFileLogger;
import com.global.api.serviceConfigs.GpApiConfig;
import lombok.experimental.UtilityClass;

import java.io.IOException;

public class TestConfig implements IRequestLogger {

    public void init(TestData testData) {
        GpApiConfig config = new GpApiConfig();
        config.setAppId(testData.getMerchant().getAppId());
        config.setAppKey(testData.getMerchant().getAppKey());
        config.setChannel(Channel.valueOf(Channel.CardNotPresent.getValue()));
        config.setEnvironment(Environment.TEST);
        config.setChallengeNotificationUrl(testData.getMerchant().getChallengeNotificationUrl());
        config.setMethodNotificationUrl(testData.getMerchant().getMethodNotificationUrl());
        config.setMerchantContactUrl(testData.getMerchant().getMerchantContactUrl());
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
