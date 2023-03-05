package com.atos.management.systems.atos_management_systems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atos.management.systems.atos_management_systems.entity.User;

public interface UserRepository extends JpaRepository<User , Long> {
    User findByEmail(String email);
    
}
