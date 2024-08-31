package com.example.cool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cool.models.Characters;
import com.example.cool.services.CRUDservice;

@RestController
public class CRUDcontroller {
     
	//create PI endpoint - POST
	
	@Autowired
	CRUDservice crudservice;
	
	@PostMapping(path="create")    //visit :> http://localhost:8080/create
	public void createHero(@RequestBody Characters superHero) {     //@RequestBody:   , here Character defines name of class and entity and also database, superhero is name to its JSON object  
		
		crudservice.CrudSuperhero(superHero);
		
	}
	
	//localhost:8080/read?id=1
	@GetMapping("read")
	public Characters readSuperHero(@RequestParam(name="id") int val) {
		return crudservice.readSuperHerobyId(val);       //it pass the val in the service class ,where val is the key which was search in the search bar 
		                                                 //
	}
	
	//update API endpoint
	@PutMapping("update")
	public void updateSuperhero(@RequestBody Characters superHeroes ,@RequestParam(name="id") int id) {
		crudservice.updateSuperHero(superHeroes,id);
	}
	
	//delete API endpoint
	@DeleteMapping("delete")
	public void deleteSuperHero(@RequestParam(name="id") int id) {
       crudservice.deleteSuperHero(id); 
	}
}
