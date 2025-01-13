package com.zhaomsdemo.research.authdemo.service;

import com.zhaomsdemo.research.authdemo.domain.AuthUser;
import com.zhaomsdemo.research.authdemo.dto.AuthUserDto;

import java.util.List;

public interface AuthUserService {

    AuthUser createUser(AuthUserDto authUserDto);
    List<AuthUser> findAll();
    AuthUser findUserById(String id);
    AuthUser findUserByUsername(String username);
    AuthUser findUserByEmail(String email);
    AuthUser updateUser(String id, AuthUser authUser);
    AuthUser deleteUser(String id);
}
