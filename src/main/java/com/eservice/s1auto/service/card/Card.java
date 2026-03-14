package com.eservice.s1auto.service.card;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Card {
    private String number;
    private int expiryMonth;
    private int expiryYear;
    private String cvv;
    private String holderName;
}