package com.eservice.s1auto.service.card;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Card {
    private String number;
    private String expiryMonth;
    private String expiryYear;
    private String cvv;
}