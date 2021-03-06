package com.skilldistillery.caravan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.caravan.entities.User;
import com.skilldistillery.caravan.entities.UserProfile;
import com.skilldistillery.caravan.repositories.ImageRepository;
import com.skilldistillery.caravan.repositories.UserProfileRepository;
import com.skilldistillery.caravan.repositories.UserRepository;

@Service
public class UserProfileServiceImpl implements UserProfileService {

	@Autowired
	private UserProfileRepository uRepo;

	@Autowired
	private UserRepository usrRepo;

	@Autowired
	private ImageRepository iRepo;

	@Override
	public UserProfile create(UserProfile userProfile, String username) {
		User user = usrRepo.findByUsername(username);

		System.out.println(user);
		userProfile.setUser(user);
		userProfile.setProfilePic(iRepo.findById(9).get());

		

		if (user != null) {
			return uRepo.saveAndFlush(userProfile);
		} else {
			return null;
		}

	}

	@Override
	public UserProfile update(UserProfile userProfile, String username, int id) {

		UserProfile userProfileToUpdate = uRepo.findById(id).get();

		if (userProfileToUpdate != null) {

			userProfileToUpdate.setAddress(userProfile.getAddress());
			userProfileToUpdate.setBio(userProfile.getBio());
			userProfileToUpdate.setEmail(userProfile.getEmail());
			userProfileToUpdate.setFirstName(userProfile.getFirstName());
			userProfileToUpdate.setLastName(userProfile.getLastName());
			userProfileToUpdate.setMileagePoints(userProfile.getMileagePoints());
			userProfileToUpdate.setProfilePic(userProfile.getProfilePic());
			userProfileToUpdate.setRegistrationDate(userProfile.getRegistrationDate());
			userProfileToUpdate.setUser(userProfile.getUser());

			return uRepo.saveAndFlush(userProfileToUpdate);

		}

		else {
			return null;
		}

	}

	@Override
	public List<UserProfile> index(String username) {

		

		return uRepo.findAll();
	}

	@Override
	public UserProfile show(String username) {

		User user = usrRepo.findByUsername(username);
		UserProfile userProfile = uRepo.findByUser(user);

		if (userProfile != null) {
			return userProfile;
		}
		return null;
	}

	@Override
	public UserProfile showById(int id) {

		UserProfile user = uRepo.findById(id).get();

		if (user != null) {
			
			
			return user;
		}
		return null;
	}

	@Override
	public boolean destroy(int id) {

		UserProfile uProfile = uRepo.findById(id).get();

		if (uProfile != null) {
			uRepo.delete(uProfile);
			return true;
		}

		return false;
	}

	@Override
	public UserProfile showByUsername(String username) {
		UserProfile usrProf = uRepo.findByUser_Username(username);

		if (usrProf != null) {
			
			
			return usrProf;

		} else {

			return null;
		}
	}

}
