package com.ust.digilocker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ust.digilocker.model.User;
@Repository

public interface DigilockerRepo  extends JpaRepository<User,Long>{

	//User getByName(String username);

	

}
