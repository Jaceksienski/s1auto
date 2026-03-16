package com.eservice.s1auto.service.storedcredential;

import com.global.api.entities.StoredCredential;
import com.global.api.entities.enums.StoredCredentialInitiator;
import com.global.api.entities.enums.StoredCredentialSequence;
import com.global.api.entities.enums.StoredCredentialType;
import org.springframework.stereotype.Component;

@Component
public class StoredCredentialTemplates {

    public StoredCredential RecurrentFirst() {
        StoredCredential storedCredential = new StoredCredential();
        storedCredential.setInitiator(StoredCredentialInitiator.CardHolder);
        storedCredential.setType(StoredCredentialType.Unscheduled);
        storedCredential.setSequence(StoredCredentialSequence.First);
        return storedCredential;
    }
}
