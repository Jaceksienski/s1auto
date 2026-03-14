package com.eservice.s1auto.logs;

import lombok.Getter;
import lombok.experimental.UtilityClass;


@UtilityClass
public class LoggerBuilder {
    @Getter
    private String logs;

    public void addToLogs(String logsToAdd){
        logs += logsToAdd;
    }
}
