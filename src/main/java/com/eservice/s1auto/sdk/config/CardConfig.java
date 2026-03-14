package com.eservice.s1auto.sdk.config;

import com.eservice.s1auto.input.TestData;
import com.global.api.paymentMethods.CreditCardData;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CardConfig {

    public CreditCardData configure(TestData testData) {
        CreditCardData card = new CreditCardData();
        card.setNumber(testData.getCard().getNumber());
        card.setExpMonth(testData.getCard().getExpiryMonth());
        card.setExpYear(testData.getCard().getExpiryYear());
        card.setCvn(testData.getCard().getCvv());
        card.setCardHolderName(testData.getCard().getHolderName());
        return card;
    }


}
