package com.teller.backend.AthenticationModule.Roles;

import com.teller.backend.Utils.Shared.EntityResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Add your annotations here
@RestController
@CrossOrigin
@RequestMapping("/api/v1/Role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @PostMapping("/addRole")
    public EntityResponse addRole(@RequestBody Role role){
        return roleService.addRole(role);
    }
}
