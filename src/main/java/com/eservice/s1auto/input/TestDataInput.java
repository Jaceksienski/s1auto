package com.eservice.s1auto.input;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TestDataInput {
    private String testCase;
    private String merchant;
    private String card;
    private String currency;
    private String amount;
    private String country;
}