package com.ust.resturant_Service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.resturant_Service.model.Resturant;

@Repository
public interface ResturantRepository extends JpaRepository<Resturant, Long> {

}
