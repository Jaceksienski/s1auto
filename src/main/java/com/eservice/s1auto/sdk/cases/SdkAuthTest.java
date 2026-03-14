package com.eservice.s1auto.sdk.cases;

import com.eservice.s1auto.input.TestData;
import com.eservice.s1auto.sdk.config.BaseTestClass;
import com.eservice.s1auto.sdk.config.CardConfig;
import com.global.api.entities.Transaction;
import com.global.api.entities.exceptions.ApiException;
import com.global.api.paymentMethods.CreditCardData;

import java.math.BigDecimal;

public class SdkAuthTest extends BaseTestClass implements Runnable {

    private final TestData testData;

    public SdkAuthTest(TestData testData) {
        this.testData = testData;
    }

    @Override
    public void run() {
        CreditCardData cardData = CardConfig.configure(testData);

        try {
            Transaction response =
                    cardData
                            .charge(new BigDecimal("19.99"))
                            .withCurrency("EUR")
                            .execute();


        } catch (ApiException ex) {
            // TODO: dodac errory
        }


    }
}
