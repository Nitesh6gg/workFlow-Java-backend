package com.workFlow.repository;

import com.workFlow.entity.UserRole;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRoleRepository extends JpaRepository<UserRole,Integer> {

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO userrole (roleId, userId) VALUES (:roleId, :userId)", nativeQuery = true)
    void saveUserRole(@Param("roleId") int roleId, @Param("userId") int userId);


}
