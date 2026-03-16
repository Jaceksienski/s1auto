package com.eservice.s1auto.webhook;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<String> webhook(@RequestBody(required = false) JsonNode body) {

        String fieldName = "";
        String field = body != null ? body.path(fieldName).asText(null) : null;

        //String zapamietaj Sienski raz na zawsze ze w JsonNode = body.path("x").path("y").path("z").asText();

        if (field == null || field.isBlank()) {
            return ResponseEntity.badRequest().body("Missing field: " + fieldName);
        }

        return ResponseEntity.ok(field);
    }
}