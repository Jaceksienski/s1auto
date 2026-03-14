package com.eservice.s1auto.output;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TestExecutionResponse {

    private String testCase;
    private String status;
    private String message;
}