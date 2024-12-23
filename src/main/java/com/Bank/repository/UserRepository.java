package com.Bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bank.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
