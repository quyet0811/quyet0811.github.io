package com.createuser.repository;

import com.createuser.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findOneByUserName(String username);

    /*List<UserEntity> findAll(String userName);
    long countByStatus(int status);
    long countByUserNameOrFullNameOrPhoneOrEmailContainingIgnoreCase(String searchValue1,String searchValue2,String searchValue3, String searchValue4);*/

}
