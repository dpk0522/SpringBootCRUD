package com.example.cool.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cool.models.Characters;

@Repository   //it work as component with readibility to understand that it is repository  
public interface SuperHeroRepository extends JpaRepository<Characters,Integer>{    //here Characters is a name of class in Characters java file  
                                                                                   //JpaRepository is a API  use to do crud operation
	                                                                               //Integer is tell the type of primary key in the characters entity
	
}
