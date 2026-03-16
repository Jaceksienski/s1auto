package com.eservice.s1auto.sdk.cases;

import com.eservice.s1auto.input.TestData;
import com.eservice.s1auto.sdk.config.BaseTestClass;
import com.eservice.s1auto.sdk.config.CardConfig;
import com.global.api.entities.enums.AlternativePaymentType;
import com.global.api.entities.exceptions.ApiException;
import com.global.api.paymentMethods.AlternativePaymentMethod;
import com.global.api.paymentMethods.CreditCardData;

public class SdkBlikTest extends BaseTestClass implements Runnable {

    private final TestData testData;

    public SdkBlikTest(TestData testData) {
        this.testData = testData;
    }

    @Override
    public void run() {
        AlternativePaymentMethod paymentMethod = new AlternativePaymentMethod(AlternativePaymentType.TESTPAY);

        paymentMethod.setReturnUrl(testData.getMerchant().getMethodNotificationUrl());
        paymentMethod.setStatusUpdateUrl(testData.getMerchant().getMethodNotificationUrl());
        paymentMethod.setDescriptor("Test BLIK Transaction");
        paymentMethod.setCountry(testData.getCountry());
        paymentMethod.setAccountHolderName(testData.getCard().getHolderName());

        try {
            response =
                    paymentMethod
                            .charge(testData.getAmount())
                            .withCurrency(testData.getCurrency())
                            .execute();

        } catch (ApiException ex) {
            testFailed(ex.getMessage());
        }

    }
}
