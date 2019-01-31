package com.javappa.postmodifying.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javappa.postmodifying.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmail(String email);
}
