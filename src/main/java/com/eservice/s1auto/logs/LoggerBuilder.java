package com.eservice.s1auto.logs;

import lombok.Getter;
import lombok.experimental.UtilityClass;

@Getter
@UtilityClass
public class LoggerBuilder {
    String logs;

    public void addToLogs(String logsToAdd){
        logs += logsToAdd;
    }
}
