package com.createuser.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "roletable")
public class RoleEntity extends BaseEntity{
    private static final long serialVersionUID = 6063693249559149508L;
    @Column
    private String userName;
    @Column
    private String code;

/*    @OneToMany(mappedBy = "roleList",cascade = CascadeType.ALL)
    private List<UserEntity> users;

    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }*/

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
