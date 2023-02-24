package com.example.blogexpanse.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.GeneratedValue;

@Entity
public class Role {
    @Id
    @GeneratedValue
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "role_name")
    private String roleName;

    public Role() {
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
