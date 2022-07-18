package com.foundationvip.springbootessentials.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class BadRequestExceptionDetails {

    private String title;
    private String details;
    private String developerMessage;
    private LocalDateTime timestamp;
    private int status;
}
