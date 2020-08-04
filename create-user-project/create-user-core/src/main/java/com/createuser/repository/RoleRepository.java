package com.createuser.repository;

import com.createuser.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    List<RoleEntity> findOneByCode(String code);
}
