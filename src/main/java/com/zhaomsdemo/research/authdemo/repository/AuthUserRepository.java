package com.zhaomsdemo.research.authdemo.repository;

import com.zhaomsdemo.research.authdemo.domain.AuthUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthUserRepository extends MongoRepository<AuthUser, String> {

    List<AuthUser> findByUsername(String username);
    List<AuthUser> findByEmail(String email);
}
