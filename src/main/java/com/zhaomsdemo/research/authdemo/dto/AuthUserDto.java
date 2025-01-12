package com.zhaomsdemo.research.authdemo.dto;

import com.zhaomsdemo.research.authdemo.enums.Role;
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

    String id;
    String username;
    String password;
    String email;
    String phone;
    Role role;
}
