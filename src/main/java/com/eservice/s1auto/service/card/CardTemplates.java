package com.eservice.s1auto.service.card;

import java.util.Map;

public class CardTemplates {

    private static final Map<CardType, Card> CARDS = Map.of(
            CardType.VISA_1, new Card("4111111111111111", "12", "2030", "123"),
            CardType.VISA_2, new Card("4000000000000002", "11", "2031", "456"),
            CardType.MASTERCARD, new Card("5555555555554444", "10", "2032", "789")
    );

    public static Card getCard(CardType cardType) {
        Card card = CARDS.get(cardType);

        if (card == null) {
            throw new IllegalArgumentException("Unsupported card type: " + cardType);
        }

        return card;
    }
}