package com.eservice.s1auto.sdk.cases;

import com.eservice.s1auto.input.TestData;

public class SdkSaleTest implements Runnable{

    private final TestData testData;

    public SdkSaleTest(TestData testData) {
        this.testData = testData;
    }

    public void run() {
        System.out.println("Running SDK Sale test...");
        System.out.println("Card: " + testData.getCard());
        System.out.println("Merchant: " + testData.getMerchant());
        System.out.println("Currency: " + testData.getCurrency());

        // tutaj robisz właściwe kroki testowe SDK Sale


    }
}