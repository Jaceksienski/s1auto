package com.eservice.s1auto.input.service;

import com.eservice.s1auto.input.TestData;
import com.eservice.s1auto.input.TestDataInput;
import com.eservice.s1auto.logs.LoggerBuilder;
import com.eservice.s1auto.output.TestExecutionResponse;
import com.eservice.s1auto.service.testcase.TestCaseExecutorFactory;
import org.springframework.stereotype.Service;

@Service
public class TestExecutionService {

    public TestExecutionResponse execute(TestDataInput input) {
        try {
            TestData testData = new TestData(input);
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