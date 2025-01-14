package com.zhaomsdemo.research.authdemo.dto;

import com.zhaomsdemo.research.authdemo.enums.Role;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthUserDto {

    @NotNull
    String username;
    @NotNull
    String password;
    @NotNull
    String email;
    String phone;
    Role role;
}
