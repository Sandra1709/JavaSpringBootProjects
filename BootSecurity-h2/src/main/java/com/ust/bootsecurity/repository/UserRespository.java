package com.ust.bootsecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.bootsecurity.service.MyUser;

@Repository
public interface UserRespository extends JpaRepository<MyUser,Long> {
	Optional<MyUser> findByUsername(String username);

}
