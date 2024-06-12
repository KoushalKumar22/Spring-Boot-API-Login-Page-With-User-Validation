package com.SpringAPI.Login_page.Repository;

import com.SpringAPI.Login_page.Entity.LoginPage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoginPageRepository extends JpaRepository<LoginPage,String> {
    Optional<LoginPage> findByUsername(String username);
}
