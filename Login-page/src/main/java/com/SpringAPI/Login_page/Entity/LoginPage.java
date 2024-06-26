package com.SpringAPI.Login_page.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "NewUserSignUp")
public class LoginPage {

    @Id

    private String username;
    private String password;

    public LoginPage(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public LoginPage() {
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
}
