package com.skilldistillery.caravan.services;

import java.security.Principal;
import java.util.List;

import com.skilldistillery.caravan.entities.Adventure;

public interface AdventureService {
	
	public List<Adventure> index();
	
	public Adventure show(int id);
	
	public Adventure create(Adventure adventure, Principal principal);

	public Adventure update(Adventure adventure, String username, int id);
	
	public boolean destroy(String username, int id);
}
