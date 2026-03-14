package com.eservice.s1auto.service.merchant;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Merchant {
    private String appId;
    private String appKey;
    private String channel;
    private String setEnvironment;
    private String challengeNotificationUrl;
    private String methodNotificationUrl;
    private String merchantContactUrl;
    private String accountName;
}