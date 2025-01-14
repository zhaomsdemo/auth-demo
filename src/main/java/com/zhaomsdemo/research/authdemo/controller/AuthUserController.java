package com.zhaomsdemo.research.authdemo.controller;

import com.zhaomsdemo.research.authdemo.domain.AuthUser;
import com.zhaomsdemo.research.authdemo.dto.AuthUserDto;
import com.zhaomsdemo.research.authdemo.service.AuthUserService;
import com.zhaomsdemo.research.authdemo.vo.Result;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthUserController {

    final AuthUserService authUserService;

    @PostMapping("/user")
    public Result<AuthUser> createUser(@RequestBody AuthUserDto authUserDto) {
        AuthUser authUser = authUserService.createUser(authUserDto);
        return Result.success(authUser);
    }
}
