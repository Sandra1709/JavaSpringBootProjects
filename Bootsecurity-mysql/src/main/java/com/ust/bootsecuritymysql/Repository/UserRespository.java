package com.ust.bootsecuritymysql.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.ust.bootsecuritymysql.*;
import com.ust.bootsecuritymysql.model.MyUser;

@Repository
public interface UserRespository extends JpaRepository<MyUser,Long> {
	Optional<MyUser> findByUsername(String username);

}
