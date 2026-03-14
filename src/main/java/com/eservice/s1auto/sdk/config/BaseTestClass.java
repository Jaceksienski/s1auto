package com.eservice.s1auto.sdk.config;

import com.eservice.s1auto.input.TestData;

public class BaseTestClass {

    public void setUp(TestData testData) {

        TestConfig sendConfig = new TestConfig();
        sendConfig.init(testData);

    }


}
