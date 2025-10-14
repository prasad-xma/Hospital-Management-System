package com.hms.server.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {
    
    private Boolean success;
    private String message;
    private Object data;
    private LocalDateTime timestamp = LocalDateTime.now();
    
    public ApiResponse(Boolean success, String message) {
        this.success = success;
        this.message = message;
    }
    
    public ApiResponse(Boolean success, String message, Object data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }
}
