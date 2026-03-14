package com.eservice.s1auto.service.merchant;

import java.util.Map;

public class MerchantTemplates {

    private static final Map<MerchantType, Merchant> MERCHANTS = Map.ofEntries(
            Map.entry(
                    MerchantType.MerchantGP_es,
                    new Merchant(
                            "i9R0byBBor6RqTQNj3g4MuVBwH5rd7yR",
                            "QVefNGo6bkMcjveA",
                            "channel_1",
                            "environment_1",
                            "https://www.example.com/challengeNotificationUrl",
                            "https://www.example.com/methodNotificationUrl",
                            "https://www.example.com/methodNotificationUrl",
                            "transaction_processing"
                    )
            ),
            Map.entry(
                    MerchantType.MerchantGP_pl,
                    new Merchant(
                            "appId_2",
                            "appKey_2",
                            "channel_2",
                            "environment_2",
                            "https://merchant2.com/challenge",
                            "https://merchant2.com/method",
                            "https://merchant2.com/contact",
                            "transaction_processing"
                    )
            ),
            Map.entry(
                    MerchantType.MerchantGP_cz,
                    new Merchant(
                            "appId_3",
                            "appKey_3",
                            "channel_3",
                            "environment_3",
                            "https://merchant3.com/challenge",
                            "https://merchant3.com/method",
                            "https://merchant3.com/contact",
                            "transaction_processing"
                    )
            )
    );

    public static Merchant getMerchant(MerchantType merchantType) {
        Merchant merchant = MERCHANTS.get(merchantType);

        if (merchant == null) {
            throw new IllegalArgumentException("Unsupported merchant type: " + merchantType);
        }

        return merchant;
    }
}