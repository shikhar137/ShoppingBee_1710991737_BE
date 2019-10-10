package com.caseStudy.eCart.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="login_details")
public class Authorization implements Serializable {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    int id ;
    @Column( name = "username")
    private String username ;
    @Column( name = "password")
    private String password ;
    @Column( name = "active")
    private int active ;
    @Column( name = "role")
    private String role ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
