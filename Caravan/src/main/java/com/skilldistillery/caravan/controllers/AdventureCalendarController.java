package com.skilldistillery.caravan.controllers;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.caravan.entities.Address;
import com.skilldistillery.caravan.entities.AdventureCalendar;
import com.skilldistillery.caravan.services.AdventureCalendarService;

@RestController
@RequestMapping("api")
@CrossOrigin({ "*", "http://localhost:4260" })
public class AdventureCalendarController {

	@Autowired
	private AdventureCalendarService svc;

	@GetMapping("adventure-calendars")
	public List<AdventureCalendar> index(Principal principal) {
		return svc.index(principal.getName());
	}

	@GetMapping("adventure-calendars/{id}")
	public AdventureCalendar showAdventureCalendar(@PathVariable int id, HttpServletRequest request, HttpServletResponse response) {

		AdventureCalendar adventureCalendar = svc.findAdventureCalendarById(id);
		if (adventureCalendar == null) {
			response.setStatus(404);
		}
		return adventureCalendar;
	}

	@PostMapping("adventure-calendars")
	public AdventureCalendar createAddress(@RequestBody AdventureCalendar adventureCalendar, HttpServletRequest request,
			HttpServletResponse response) {
		if ((adventureCalendar = svc.createAdventureCalendar(adventureCalendar)) != null) {
			response.setStatus(201);
			StringBuffer url = request.getRequestURL();
			url.append("/").append(adventureCalendar.getId());
			response.addHeader("Location", url.toString());
			return adventureCalendar;
		} else {
			response.setStatus(400);
			return null;
		}
	}

	@PutMapping("adventure-calendars/{id}")
	public AdventureCalendar updateAdventureCalendar(@PathVariable int id, @RequestBody AdventureCalendar adventureCalendar, HttpServletRequest request,
			HttpServletResponse response) {
		try {
			adventureCalendar = svc.updateAdventureCalendar(id, adventureCalendar);
			if (adventureCalendar == null) {
				response.setStatus(404);
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(400);
			adventureCalendar = null;
		}
		return adventureCalendar;
	}

	@DeleteMapping("adventure-calendars/{id}")
	public boolean deleteAdventureCalendar(@PathVariable int id, HttpServletRequest request, HttpServletResponse response) {

		try {
			boolean deleted = svc.deleteAdventureCalendarById(id);
			if (deleted) {
				response.setStatus(204);
				return true;
			} else {
				response.setStatus(404);
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(400);
			return false;
		}

	}

}
