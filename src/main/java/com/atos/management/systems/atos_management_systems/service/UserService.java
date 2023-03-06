package com.atos.management.systems.atos_management_systems.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.atos.management.systems.atos_management_systems.dto.UserRegistrationDto;
import com.atos.management.systems.atos_management_systems.entity.User;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
