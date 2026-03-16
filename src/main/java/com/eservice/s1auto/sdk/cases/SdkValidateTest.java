package com.eservice.s1auto.sdk.cases;

import com.eservice.s1auto.input.TestData;
import com.eservice.s1auto.sdk.config.BaseTestClass;
import com.eservice.s1auto.sdk.config.CardConfig;
import com.global.api.entities.exceptions.ApiException;
import com.global.api.paymentMethods.CreditCardData;

public class SdkValidateTest extends BaseTestClass implements Runnable {

    private final TestData testData;

    public SdkValidateTest(TestData testData) {
        this.testData = testData;
    }

    @Override
    public void run() {
        CreditCardData cardData = CardConfig.configure(testData);

        try {
            response =
                    cardData
                            .verify()
                            .withCurrency(testData.getCurrency())
                            .execute();

        } catch (ApiException ex) {
            testFailed(ex.getMessage());
        }

    }
}
