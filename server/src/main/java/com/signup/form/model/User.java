package com.signup.form.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
    @Column(name="name")
    private String name;
    @Id
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="dob")
    private String dob;
    @Column(name="email")
    private String email;
    @Column(name="mob_no")
    private String mob_no;
     public User() {}
    public User(String name, String username, String password, String dob, String email, String mob_no)
    {
        this.name=name;
        this.username=username;
        this.password=password;
        this.dob=dob;
        this.email=email;
        this.mob_no=mob_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMob_no() {
        return mob_no;
    }

    public void setMob_no(String mob_no) {

    }
}
