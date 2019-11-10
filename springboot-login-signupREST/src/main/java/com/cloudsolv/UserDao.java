package com.cloudsolv;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository {

    User findByUsername(String username);

    User findByEmail(String email);
}