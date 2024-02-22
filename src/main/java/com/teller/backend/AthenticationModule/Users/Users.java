package com.teller.backend.AthenticationModule.Users;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.management.relation.Role;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

//Add the relevant java annotations
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Table(name = "users")
public class Users {

    @Id
    @SequenceGenerator(name = "user_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @Column(name = "sNumber", updatable = false)
    private Long serialNumber;
    @Column(name = "fisrtName", length = 30, nullable = false)
    private String firstName;
    @Column(name = "lastName", length = 30, nullable = false)
    private String lastName;
    @Column(name = "userName", length = 60, unique = true, nullable = false)
    private String username;
    @Column(name = "email", length = 60,unique = true, nullable = false)
    private String email;
    @Column(name = "password", length = 100, nullable = false)
    private String password;
    @Column(name = "idNumber", length = 20, unique = true, nullable = false)
    private String idNumber;
    @Column(name = "accountNo", length = 15, unique = true, nullable = false)
    private String accountNo;
    @Column(name = "phoneNo", length = 15)
    private String phoneNo;
    @Column(name = "pfNumber", length = 10, unique = true)
    private String pfNumber;
    @Column(name = "pAddress", length = 20)
    private String pAddress;
    @Column(name = "bank", length = 50, nullable = false)
    private String bankName;
    @Column(name = "branch", length = 50, unique = true, nullable = false)
    private String bankBranch;
    @Column(name = "bankCode", length = 20, nullable = false)
    private Long bankCode;
    @Column(name = "branchCode", length = 20, unique = true, nullable = false)
    private Long branchCode;

    //Operational audit
    //Post

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "createdBy", length = 50)
    private String createdBy;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "createdOn", length = 50)
    private LocalDateTime createdOn;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "createdFlag", length = 1)
    private Character createdFlag = 'N';

    //Modify
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "modifiedBy", length = 50)
    private String modifiedBy;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "modifedOn", length = 50)
    private LocalDateTime modifedOn;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "modifiedflag", length = 5)
    private Character modifiedflag = 'N';

    //Modify
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "verifiedBy", length = 50)
    private String verifiedBy;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "verifiedOn", length = 50)
    private LocalDateTime verifiedOn;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "verifiedFlag", length = 5)
    private Character verifiedFlag = 'N';

    //Delete
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "deletedBy", length = 50)
    private String deletedBy;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "deletedTOn", length = 50)
    private LocalDateTime deletedTOn;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Column(name = "deleteFlag", length = 5)
    private Character deleteFlag = 'N';

    //account

    @Column(name = "active", length = 30)
    private boolean isAcctActive;
    @Column(name = "firstLogin", length = 1)
    private Character firstLogin = 'Y';
    @Column(name = "locked", length = 10)
    private boolean isAcctLocked;
    private boolean systemGenPassword = true;
    //Define relationships
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "user_roles",
//    joinColumns = @JoinColumn(name = "user_id"),
//    inverseJoinColumns = @JoinColumn(name = "role_id"))
//
//    private Set<Role> roles = new HashSet<>();


}
