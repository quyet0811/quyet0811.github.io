package com.createuser.repository;

import com.createuser.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findOneByUserName(String username);
}
