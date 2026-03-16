package com.eservice.s1auto.input;

import com.eservice.s1auto.TestFailedException;
import com.eservice.s1auto.service.card.Card;
import com.eservice.s1auto.service.card.CardTemplates;
import com.eservice.s1auto.service.card.CardType;
import com.eservice.s1auto.service.merchant.Merchant;
import com.eservice.s1auto.service.merchant.MerchantTemplates;
import com.eservice.s1auto.service.merchant.MerchantType;
import com.eservice.s1auto.service.testcase.TestCaseType;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
@Getter
public class TestData {

    private MerchantTemplates merchantTemplates;
    private CardTemplates cardTemplates;

    private final Card card;
    private final Merchant merchant;
    private final TestCaseType testCase;
    private final String currency;
    private final String country;
    private final BigDecimal amount;

    public TestData(TestDataInput input, MerchantTemplates merchantTemplates, CardTemplates cardTemplates) {
        CardType cardType = CardType.valueOf(input.getCard().toUpperCase());
        MerchantType merchantType = MerchantType.valueOf(input.getMerchant().toUpperCase());
        TestCaseType testCaseType = TestCaseType.valueOf(input.getTestCase().toUpperCase());

        try {
            switch (cardType) {
                case VISA_1 -> this.card = cardTemplates.visa1();
                case VISA_2 -> this.card = cardTemplates.visa2();
                case MASTERCARD -> this.card = cardTemplates.mc1();
                default -> {
                    this.card = null;
                    log.error("BRAK POPRAWNEJ KARTY W ZAPYTANIU");
                }
            }
            switch (merchantType) {
                case MerchantGP_cz -> this.merchant = merchantTemplates.merchantGP_es();
                case MerchantGP_pl -> this.merchant = merchantTemplates.merchantGP_pl();
                case MerchantGP_es -> this.merchant = merchantTemplates.merchantGP_cz();
                default -> {
                    this.merchant = null;
                    log.error("BRAK POPRAWNEGO MERCHANTA W ZAPYTANIU!");
                }
            }
        } catch (Exception e) {
            throw new TestFailedException(e.getMessage());
        }


        this.testCase = testCaseType;
        this.currency = input.getCurrency();
        this.country = input.getCountry();
        amount = new BigDecimal(input.getAmount());
    }
}