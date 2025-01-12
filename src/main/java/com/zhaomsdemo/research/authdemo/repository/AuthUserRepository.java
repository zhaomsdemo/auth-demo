package com.zhaomsdemo.research.authdemo.repository;

import com.zhaomsdemo.research.authdemo.domain.AuthUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthUserRepository extends MongoRepository<AuthUser, String> {
}
