package com.zhaomsdemo.research.authdemo.service;

import com.zhaomsdemo.research.authdemo.domain.AuthUser;

public interface AuthUserService {

    AuthUser createUser(AuthUser authUser);
    AuthUser findUserById(String id);
    AuthUser findUserByUsername(String username);
    AuthUser findUserByEmail(String email);
    AuthUser updateUser(String id, AuthUser authUser);
    AuthUser deleteUser(String id);
}
