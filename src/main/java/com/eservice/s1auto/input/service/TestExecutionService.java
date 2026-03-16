package com.eservice.s1auto.input.service;

import com.eservice.s1auto.input.TestData;
import com.eservice.s1auto.input.TestDataInput;
import com.eservice.s1auto.logs.LoggerBuilder;
import com.eservice.s1auto.output.TestExecutionResponse;
import com.eservice.s1auto.service.card.CardTemplates;
import com.eservice.s1auto.service.merchant.MerchantTemplates;
import com.eservice.s1auto.service.testcase.TestCaseExecutorFactory;
import org.springframework.stereotype.Service;

@Service
public class TestExecutionService {

    private final MerchantTemplates merchantTemplates;
    private final CardTemplates cardTemplates;

    public TestExecutionService(MerchantTemplates merchantTemplates, CardTemplates cardTemplates) {
        this.merchantTemplates = merchantTemplates;
        this.cardTemplates = cardTemplates;
    }

    public TestExecutionResponse execute(TestDataInput input) {
        try {
            TestData testData = new TestData(input, merchantTemplates, cardTemplates);
            Runnable testRunner = TestCaseExecutorFactory.getRunner(testData.getTestCase(), testData);
            testRunner.run();

            return new TestExecutionResponse(
                    testData.getTestCase().name(),
                    "SUCCESS",
                    LoggerBuilder.getLogs()
            );

        } catch (Exception e) {
            LoggerBuilder.addToLogs(e.getMessage());
            return new TestExecutionResponse(
                    input.getTestCase(),
                    "FAILED",
                    LoggerBuilder.getLogs()
            );
        }
    }
}