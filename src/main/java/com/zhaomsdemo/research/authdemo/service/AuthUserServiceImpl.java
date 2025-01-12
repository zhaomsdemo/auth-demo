package com.zhaomsdemo.research.authdemo.service;

import com.zhaomsdemo.research.authdemo.domain.AuthUser;
import com.zhaomsdemo.research.authdemo.repository.AuthUserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthUserServiceImpl implements AuthUserService {

    final AuthUserRepository authUserRepository;

    @Override
    public AuthUser createUser(AuthUser authUser) {
        return authUserRepository.save(authUser);
    }

    @Override
    public AuthUser findUserById(String id) {
        return null;
    }

    @Override
    public AuthUser findUserByUsername(String username) {
        return null;
    }

    @Override
    public AuthUser findUserByEmail(String email) {
        return null;
    }

    @Override
    public AuthUser updateUser(String id, AuthUser authUser) {
        return null;
    }

    @Override
    public AuthUser deleteUser(String id) {
        return null;
    }
}
