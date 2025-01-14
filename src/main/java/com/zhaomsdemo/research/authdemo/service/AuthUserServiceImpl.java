package com.zhaomsdemo.research.authdemo.service;

import com.zhaomsdemo.research.authdemo.domain.AuthUser;
import com.zhaomsdemo.research.authdemo.dto.AuthUserDto;
import com.zhaomsdemo.research.authdemo.exception.NotFoundException;
import com.zhaomsdemo.research.authdemo.repository.AuthUserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthUserServiceImpl implements AuthUserService {

    final AuthUserRepository authUserRepository;

    @Override
    public AuthUser createUser(AuthUserDto authUserDto) {
        AuthUser authUser = toAuthUser(authUserDto);
        return authUserRepository.save(authUser);
    }

    @Override
    public List<AuthUser> findAll() {
        return authUserRepository.findAll();
    }

    @Override
    public AuthUser findUserById(String id) {
        return authUserRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

    @Override
    public List<AuthUser> findUserByUsername(String username) {
        return authUserRepository.findByUsername(username);
    }

    @Override
    public List<AuthUser> findUserByEmail(String email) {
        return authUserRepository.findByEmail(email);
    }

    @Override
    public AuthUser updateUser(String id, AuthUser authUser) {
        return null;
    }

    @Override
    public AuthUser deleteUser(String id) {
        return null;
    }

    private AuthUser toAuthUser(AuthUserDto authUserDto) {
        AuthUser authUser = new AuthUser();
        BeanUtils.copyProperties(authUserDto, authUser);
        return authUser;
    }
}
