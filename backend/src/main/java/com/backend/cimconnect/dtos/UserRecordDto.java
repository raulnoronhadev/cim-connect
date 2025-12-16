package com.backend.cimconnect.dtos;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserRecordDto(@NotBlank String name, @NotNull Integer age, @NotBlank String city, @NotBlank String church, @NotBlank String pastor, @NotBlank String role) {

}
