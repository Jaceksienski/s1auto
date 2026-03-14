package com.eservice.s1auto.input;

import com.eservice.s1auto.service.card.Card;
import com.eservice.s1auto.service.card.CardTemplates;
import com.eservice.s1auto.service.card.CardType;
import com.eservice.s1auto.service.merchant.Merchant;
import com.eservice.s1auto.service.merchant.MerchantTemplates;
import com.eservice.s1auto.service.merchant.MerchantType;
import com.eservice.s1auto.service.testcase.TestCaseType;
import lombok.Getter;

@Getter
public class TestData {

    private final Card card;
    private final Merchant merchant;
    private final TestCaseType testCase;
    private final String currency;
    private final String country;

    public TestData(TestDataInput input) {
        CardType cardType = CardType.valueOf(input.getCard().toUpperCase());
        MerchantType merchantType = MerchantType.valueOf(input.getMerchant().toUpperCase());
        TestCaseType testCaseType = TestCaseType.valueOf(input.getTestCase().toUpperCase());

        this.card = CardTemplates.getCard(cardType);
        this.merchant = MerchantTemplates.getMerchant(merchantType);
        this.testCase = testCaseType;
        this.currency = input.getCurrency();
        this.country = input.getCountry();
    }
}