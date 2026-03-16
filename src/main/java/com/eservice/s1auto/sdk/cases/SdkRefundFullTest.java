package com.eservice.s1auto.sdk.cases;


import com.eservice.s1auto.input.TestData;
import com.eservice.s1auto.sdk.config.BaseTestClass;
import com.eservice.s1auto.sdk.config.CardConfig;
import com.global.api.entities.Transaction;
import com.global.api.entities.exceptions.ApiException;
import com.global.api.paymentMethods.CreditCardData;

public class SdkRefundFullTest extends BaseTestClass implements Runnable {

    private final TestData testData;

    public SdkRefundFullTest(TestData testData) {
        this.testData = testData;
    }

    @Override
    public void run() {
        CreditCardData cardData = CardConfig.configure(testData);
        Transaction first = null;
        try {
            first = cardData
                            .charge(testData.getAmount())
                            .withCurrency("EUR")
                            .execute();

        } catch (ApiException e) {
            testFailed(e.getMessage());

        }
        try {
            assert first != null;
            response =
                    first
                            .refund(testData.getAmount())
                            .withCurrency(testData.getCurrency())
                            .execute();


        } catch (ApiException ex) {
            testFailed(ex.getMessage());
        }

    }
}
