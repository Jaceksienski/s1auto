package com.eservice.s1auto.sdk.cases;

import com.eservice.s1auto.input.TestData;
import com.eservice.s1auto.sdk.config.BaseTestClass;

public class SdkSaleTest extends BaseTestClass implements Runnable {

    private final TestData testData;

    public SdkSaleTest(TestData testData) {
        this.testData = testData;
    }

    @Override
    public void run() {


        boolean isApiReachable = true;

        if (!isApiReachable) {
            throw new RuntimeException("Nie można połączyć się z API Merchanta");
        }

    }
}