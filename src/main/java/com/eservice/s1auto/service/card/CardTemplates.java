package com.eservice.s1auto.service.card;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CardTemplates {

//    private static final Map<CardType, Card> CARDS = Map.of(
//            CardType.VISA_1, new Card("4111111111111111", Integer.getInteger("12"), Integer.getInteger("2030"), "123", "NameSurname"),
//            CardType.VISA_2, new Card("4000000000000002", Integer.getInteger("11"), Integer.getInteger("2031"), "456", "NameSurname"),
//            CardType.MASTERCARD, new Card("5555555555554444", Integer.getInteger("10"), Integer.getInteger("2032"), "789", "NameSurname")
//    );
//
//    public static Card getCard(CardType cardType) {
//        Card card = CARDS.get(cardType);
//
//        if (card == null) {
//            throw new IllegalArgumentException("Unsupported card type: " + cardType);
//        }
//
//        return card;
//    }

    public Card visa1() {
        return new Card("4111111111111111", Integer.getInteger("12"), Integer.getInteger("2030"), "123", "NameSurname");
    }

    public Card visa2() {
        return new Card("4000000000000002", Integer.getInteger("11"), Integer.getInteger("2031"), "456", "NameSurname");
    }

    public Card mc1() {
        return new Card("5555555555554444", Integer.getInteger("10"), Integer.getInteger("2032"), "789", "NameSurname");
    }

}