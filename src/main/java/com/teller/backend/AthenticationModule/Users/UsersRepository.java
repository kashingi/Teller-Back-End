package com.teller.backend.AthenticationModule.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

//Add your annotations here
@RequestMapping
public interface UsersRepository extends JpaRepository<Users, Long> {
//    Optional<Users> findByUsername(String username);
//    boolean existsByUsername(String username);
//    boolean existsByEmail(String email);
//    boolean existsByPhoneNo(String phone);
//    List<Users> findByDeletedFlag(Character deleteFlag);
//    Optional<Users> findByEmail(String email);

    //Make a query

}
