package com.example.digital_academy_pda.Entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
@TableGenerator(name = "Role")

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id ;
    private String name ;

    @OneToMany
    List<User> users ;

    public Role() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
