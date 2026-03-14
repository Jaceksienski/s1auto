package com.eservice.s1auto.service.testcase;

import com.eservice.s1auto.input.TestData;
import com.eservice.s1auto.sdk.cases.SdkRefundTest;
import com.eservice.s1auto.sdk.cases.SdkSaleTest;
import com.eservice.s1auto.service.TestCaseRunner;

import java.util.Map;

public class TestCaseExecutorFactory {

    public static TestCaseRunner getRunner(TestCaseType testCaseType, TestData testData) {
        Map<TestCaseType, TestCaseRunner> runners = Map.ofEntries(
                Map.entry(TestCaseType.SDK_SALE, new SdkSaleTest(testData)),
                Map.entry(TestCaseType.SDK_REFUND, new SdkRefundTest(testData))
        );

        TestCaseRunner runner = runners.get(testCaseType);

        if (runner == null) {
            throw new IllegalArgumentException("Unsupported test case type: " + testCaseType);
        }

        return runner;
    }
}