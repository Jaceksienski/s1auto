package com.eservice.s1auto.sdk.cases;


import com.eservice.s1auto.input.TestData;
import com.eservice.s1auto.sdk.config.BaseTestClass;

public class SdkRefundTest extends BaseTestClass implements Runnable {

    private final TestData testData;

    public SdkRefundTest(TestData testData) {
        this.testData = testData;
    }

    @Override
    public void run() {
        setUp(testData);

        System.out.println("Uruchamianie testu SDK Sale...");
        System.out.println("Karta: " + testData.getCard().getNumber());

        boolean isApiReachable = true;

        if (!isApiReachable) {
            throw new RuntimeException("Nie można połączyć się z API Merchanta");
        }

    }
}
