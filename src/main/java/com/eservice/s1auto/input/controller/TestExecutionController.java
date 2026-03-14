package com.eservice.s1auto.input.controller;

import com.eservice.s1auto.input.TestDataInput;
import com.eservice.s1auto.input.service.TestExecutionService;
import com.eservice.s1auto.output.TestExecutionResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tests")
@RequiredArgsConstructor
public class TestExecutionController {

    private final TestExecutionService testExecutionService;

    @PostMapping
    public ResponseEntity<TestExecutionResponse> executeTest(@RequestBody TestDataInput input) {
        TestExecutionResponse response = testExecutionService.execute(input);
        return ResponseEntity.ok(response);
    }
}