package com.eservice.s1auto.service.testcase;

import com.eservice.s1auto.input.TestData;
import com.eservice.s1auto.sdk.cases.SdkAuthTest;
import com.eservice.s1auto.sdk.cases.SdkRefundTest;
import com.eservice.s1auto.sdk.cases.SdkSaleTest;

public class TestCaseExecutorFactory {

    public static Runnable getRunner(TestCaseType testCaseType, TestData testData) {
        return switch (testCaseType) {
            case SDK_SALE -> new SdkSaleTest(testData);
            case SDK_REFUND -> new SdkRefundTest(testData);
            case SDK_AUTHORIZE -> new SdkAuthTest(testData);
            default -> throw new IllegalArgumentException("Nieobsługiwany typ testu: " + testCaseType);
        };
    }
}