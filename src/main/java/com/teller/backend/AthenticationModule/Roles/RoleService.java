package com.teller.backend.AthenticationModule.Roles;

import com.teller.backend.Utils.Shared.EntityResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.stereotype.Service;

//Add your annotations here
@Service
@Slf4j
public class RoleService {

    @Autowired
    RoleRepository roleRepository;
    public EntityResponse addRole(Role role) {
        EntityResponse entityResponse = new EntityResponse<>();
        try {
            Role savedRole = roleRepository.save(role);
            entityResponse.setMessage("Role created successfully.");
            entityResponse.setSatatusCode(HttpStatus.CREATED.value());
            entityResponse.setEntity(savedRole);
        }catch (Exception e){
            log.error("An error occurred while trying to create a role {}", e);
        }
        return entityResponse;
    }
}
