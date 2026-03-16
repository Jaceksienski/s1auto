package com.eservice.s1auto.service.card;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CardTemplates {

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