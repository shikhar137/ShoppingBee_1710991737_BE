package com.caseStudy.eCart.models;

import javax.persistence.*;

@Entity
@Table(name="userinfo")
public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name;
    private String password ;
    private String email ;
    private long number ;

    public User()
    {

    }
    public User( String name , String password , String email , long number )
    {
        this.name = name ;
        this.password = password ;
        this.email = email ;
        this.number = number ;
    }
    @Embedded
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}



