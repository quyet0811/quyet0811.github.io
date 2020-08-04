package com.createuser.entity;

import javax.persistence.*;
import java.util.List;


@Entity(name = "users")
public class UserEntity extends BaseEntity{
    private static final long serialVersionUID = 5578862534610843411L;
    @Column
    private String userName;
    @Column
    private String email;
    @Column
    private String phone;
    @Column
    private String avatar;

    @Column
    private String role_id;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    /*@ManyToOne
    @JoinColumn(name = "role_id")*/
/*    private RoleEntity roleList;

    public RoleEntity getRoleList() {
        return roleList;
    }

    public void setRoleList(RoleEntity roleList) {
        this.roleList = roleList;
    }*/

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

}
