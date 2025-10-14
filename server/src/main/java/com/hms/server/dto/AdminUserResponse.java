package com.hms.server.dto;

import com.hms.server.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminUserResponse {
    private String id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private LocalDate dateOfBirth;
    private Set<User.Role> roles;
    private boolean approved;
    private boolean active;
    private String specialization;
    private String department;
    private String licenseNumber;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}


