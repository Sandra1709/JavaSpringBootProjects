package com.ust.swiggy_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.swiggy_app.model.Swiggy;

@Repository
public interface SwiggyRepository  extends JpaRepository<Swiggy, Long>{

}
