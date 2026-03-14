package com.eservice.s1auto.service;

import com.eservice.s1auto.input.TestDataInput;
import com.eservice.s1auto.output.TestResult;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public TestResult process(TestDataInput input) {

        if ("PLN".equalsIgnoreCase(input.getCurrency())) {
            return new TestResult(
                    input.getTestCase(),
                    "SUCCESS",
                    "Payment processed correctly"
            );
        }

        return new TestResult(
                input.getTestCase(),
                "FAILED",
                "Unsupported currency: " + input.getCurrency()
        );
    }
}
