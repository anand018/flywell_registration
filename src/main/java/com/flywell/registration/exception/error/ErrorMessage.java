package com.flywell.registration.exception.error;

import java.time.LocalDateTime;

public class ErrorMessage {

    private String cause;
    private LocalDateTime time;

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
