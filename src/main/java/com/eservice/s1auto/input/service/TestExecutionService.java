package com.eservice.s1auto.input.service;


import com.eservice.s1auto.input.TestData;
import com.eservice.s1auto.input.TestDataInput;
import com.eservice.s1auto.output.TestExecutionResponse;
import com.eservice.s1auto.service.TestCaseRunner;
import com.eservice.s1auto.service.testcase.TestCaseExecutorFactory;
import org.springframework.stereotype.Service;

@Service
public class TestExecutionService {

    public TestExecutionResponse execute(TestDataInput input) {
        TestData testData = new TestData(input);

        TestCaseRunner runner = TestCaseExecutorFactory.getRunner(testData.getTestCaseType(), testData);

        String result = runner.run();

        return new TestExecutionResponse(
                testData.getTestCaseType().name(),
                result,
                "Test finished"
        );
    }


}