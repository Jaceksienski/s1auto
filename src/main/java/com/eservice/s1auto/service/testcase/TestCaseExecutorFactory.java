package com.eservice.s1auto.service.testcase;

import com.eservice.s1auto.input.TestData;
import com.eservice.s1auto.sdk.cases.*;

public class TestCaseExecutorFactory {

    public static Runnable getRunner(TestCaseType testCaseType, TestData testData) {
        return switch (testCaseType) {
            case SDK_BLIK -> new SdkBlikTest(testData);
            case SDK_REFUND_FULL -> new SdkRefundFullTest(testData);
            case SDK_REFUND_PARTIAL -> new SdkRefundPartialTest(testData);
            case SDK_AUTHORIZE -> new SdkAuthTest(testData);
            case SDK_VALIDATE -> new SdkValidateTest(testData);
            default -> throw new IllegalArgumentException("Nieobsługiwany typ testu: " + testCaseType);
        };
    }
}