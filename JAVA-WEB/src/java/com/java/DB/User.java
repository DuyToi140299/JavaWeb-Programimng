/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.DB;

/**
 *
 * @author Admin
 */
public class User {
    private String id;
    private String Username;
    private String Password;
    private String Fullname;
    private String Email;
    private String Address;

    public User() {
    }

    public User(String id, String Username, String Password, String Fullname, String Email, String Address) {
        this.id = id;
        this.Username = Username;
        this.Password = Password;
        this.Fullname = Fullname;
        this.Email = Email;
        this.Address = Address;
    }

    public User(String Username, String Password, String Fullname, String Email, String Address) {
        this.Username = Username;
        this.Password = Password;
        this.Fullname = Fullname;
        this.Email = Email;
        this.Address = Address;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    
}
