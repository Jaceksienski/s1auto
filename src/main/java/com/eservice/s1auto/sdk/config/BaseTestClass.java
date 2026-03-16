package com.eservice.s1auto.sdk.config;

import com.eservice.s1auto.TestFailedException;
import com.eservice.s1auto.input.TestData;
import com.global.api.entities.Transaction;

public class BaseTestClass {

    public Transaction response;

    public void setUp(TestData testData) {

        TestConfig sendConfig = new TestConfig();
        sendConfig.init(testData);

    }

    public void checkTransactionStatus() {
    }

    public void testFailed(String message){
        throw new TestFailedException("Test failed! Check details below: " + message);
    }

}
