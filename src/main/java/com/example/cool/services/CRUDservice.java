package com.example.cool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cool.models.Characters;
import com.example.cool.repositories.SuperHeroRepository;

@Service
public class CRUDservice {
	
	@Autowired
	SuperHeroRepository shr;
	
	public void CrudSuperhero(Characters superHero) {
	     shr.save(superHero);     
	}

	public Characters readSuperHerobyId(int val) {
		// TODO Auto-generated method stub
		return shr.findById(val).get();   //it finds the data by id(which is pass as val here) , id is a primary key in entity,get function is used get it...
	}

	public void updateSuperHero(Characters superHeroes, int id) {
		// TODO Auto-generated method stub
		Characters changeCharacters = readSuperHerobyId(id);
		changeCharacters.setHumanName(superHeroes.getHumanName());
		
		shr.save(changeCharacters);
	}

	public void deleteSuperHero(int id) {
		// TODO Auto-generated method stub
		shr.deleteById(id);
	}
	
}
