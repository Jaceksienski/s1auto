package com.eservice.s1auto.service.merchant;

import org.springframework.stereotype.Component;

@Component
public class MerchantTemplates {

    public Merchant merchantGP_es() {
        return new Merchant(
                "i9R0byBBor6RqTQNj3g4MuVBwH5rd7yR",
                "QVefNGo6bkMcjveA",
                "channel_1",
                "environment_1",
                "https://www.example.com/challengeNotificationUrl",
                "https://www.example.com/methodNotificationUrl",
                "https://www.example.com/methodNotificationUrl",
                "transaction_processing"
        );
    }

    public Merchant merchantGP_pl() {
        return new Merchant(
                "appId_2",
                "appKey_2",
                "channel_2",
                "environment_2",
                "https://merchant2.com/challenge",
                "https://merchant2.com/method",
                "https://merchant2.com/contact",
                "transaction_processing"
        );
    }

    public Merchant merchantGP_cz() {
        return new Merchant(
                "appId_3",
                "appKey_3",
                "channel_3",
                "environment_3",
                "https://merchant3.com/challenge",
                "https://merchant3.com/method",
                "https://merchant3.com/contact",
                "transaction_processing"
        );
    }

}