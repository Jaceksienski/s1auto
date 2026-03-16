package com.eservice.s1auto.sdk.cases;

import com.eservice.s1auto.input.StandardConfig;
import com.eservice.s1auto.input.TestData;
import com.eservice.s1auto.sdk.config.BaseTestClass;
import com.eservice.s1auto.sdk.config.CardConfig;
import com.eservice.s1auto.service.storedcredential.StoredCredentialTemplates;
import com.global.api.entities.ThreeDSecure;
import com.global.api.entities.Transaction;
import com.global.api.entities.exceptions.ApiException;
import com.global.api.paymentMethods.CreditCardData;

public class SdkRecurringFirst extends BaseTestClass implements Runnable {

    private final TestData testData;
    private final StoredCredentialTemplates storedCredential;

    public SdkRecurringFirst(TestData testData, StoredCredentialTemplates storedCredential) {
        this.testData = testData;
        this.storedCredential = storedCredential;
    }

    @Override
    public void run() {
        CreditCardData cardData = CardConfig.configure(testData);

        try {
            ThreeDSecure threeDSecure = new ThreeDSecure();
            threeDSecure.setProviderServerTransRef(StandardConfig.getProviderServerTransRef());
            threeDSecure.setAuthenticationValue(StandardConfig.getAuthenticationValue());
            threeDSecure.setEci(StandardConfig.getEci());
            threeDSecure.setMessageVersion(StandardConfig.getMessageVersion());
            cardData.setThreeDSecure(threeDSecure);


            Transaction trx = cardData.charge(testData.getAmount())
                    .withCurrency(testData.getCurrency())
                    .withClientTransactionId("14406011")
                    .withStoredCredential(storedCredential.RecurrentFirst())
                    .execute();

        } catch (ApiException ex) {
            testFailed(ex.getMessage());
        }
    }
}
