#  [Caravan](http://3.132.5.31:8080/Caravan)

![Project Screenshot](https://github.com/richardanewman/richardanewman.github.io/blob/master/images/caravan.png)

This is a fork of our mid term project. The original repo can be found here: https://github.com/noel-castillo/FinalProject

This fork will continue to be updated and improved beyond MVP.

### Week 16 Final Project for Skill Distillery

### Overview

Caravan is a road trip application which allows a logged in authenticated user to host or join long distance road trips.

### Technologies

Java Version 1.8, Angular, SQL, MySQL Workbench, Spring Boot, Spring Security, JPA, Hibernate, Gradle, AWS EC2, Git, Github, Postman, Spring Tool Suite, Visual Studio Code, and Atom

## Caravan

| HTTP Verb | URI                  | Request Body | Response Body | Purpose |
|-----------|----------------------|--------------|---------------|---------|
| **ADDRESS**|                     |              |               |         |
| GET       | `/api/addresses`      |              | Collection of representations of all _addresses_  | **List** or **collection** endpoint |
| GET       | `/api/addresses/3`   |              | Representation of _address_ `3` | **Retrieve** endpoint |
| POST      | `/api/addresses`      | Representation of a new _address_ | Description of the result of the operation | **Create** endpoint |
| PUT       | `/api/addresses/3`   | Representation of a new version of address `3` | | **Replace** endpoint |
| DELETE    | `/api/addresses/3`   |              | | **Delete** route |
| **ADVENTURE-CALENDARS**|                     |              |               |         |
| GET       | `/api/adventure-calendars`      |              | Collection of representations of all _adventure-calendars_  | **List** or **collection** endpoint |
| GET       | `/api/adventure-calendars/3`   |              | Representation of _adventure-calendar_ `3` | **Retrieve** endpoint |
| POST      | `/api/adventures/3/adventure-calendars`      | Representation of a new _adventure-calendar_ for adventure 3  | Description of the result of the operation | **Create** endpoint |
| PUT       | `/api/adventure-calendars/3`   | Representation of a new version of adventure-calendar `3` | | **Replace** endpoint |
| DELETE    | `/api/adventure-calendars/3`   |              | | **Delete** route |
| **ADVENTURES**|                     |              |               |         |
| GET       | `/api/adventures`      |              | Collection of representations of all _adventures_  | **List** or **collection** endpoint |
| GET       | `/api/adventures/3`   |              | Representation of _adventure_ `3` | **Retrieve** endpoint |
| POST      | `/api/adventures`      | Representation of a new _adventures_  | Description of the result of the operation | **Create** endpoint |
| PUT       | `/api/adventures/3`   | Representation of a new version of adventure `3` | | **Replace** endpoint |
| DELETE    | `/api/adventures/3`   |              | | **Delete** route |
| **CATEGORIES**|                     |              |               |         |
| GET       | `/api/categories`      |              | Collection of representations of all _categories_  | **List** or **collection** endpoint |
| GET       | `/api/categories/3`   |              | Representation of _category_ `3` | **Retrieve** endpoint |
| POST      | `/api/categories`      | Representation of a new _category_  | Description of the result of the operation | **Create** endpoint |
| PUT       | `/api/categories/3`   | Representation of a new version of category `3` | | **Replace** endpoint |
| DELETE    | `/api/categories/3`   |              | | **Delete** route |
| **IMAGES**|                     |              |               |         |
| GET       | `/api/images`      |              | Collection of representations of all _images_  | **List** or **collection** endpoint |
| GET       | `/api/images/3`   |              | Representation of _image_ `3` | **Retrieve** endpoint |
| POST      | `/api/images`      | Representation of a new _image_  | Description of the result of the operation | **Create** endpoint |
| PUT       | `/api/images/3`   | Representation of a new version of image `3` | | **Replace** endpoint |
| DELETE    | `/api/images/3`   |              | | **Delete** route |
| **TRIP-CALENDARS**|                     |              |               |         |
| GET       | `/api/tripCalendars`      |              | Collection of representations of all _tripCalendars_  | **List** or **collection** endpoint |
| GET       | `/api/tripCalendars/3`   |              | Representation of _tripCalendar_ `3` | **Retrieve** endpoint |
| POST      | `/api/trips/3/tripCalendars`      | Representation of a new _tripCalendar_ for trip 3 | Description of the result of the operation | **Create** endpoint |
| PUT       | `/api/tripCalendars/3`   | Representation of a new version of tripCalendar `3` | | **Replace** endpoint |
| DELETE    | `/api/tripCalendars/3`   |              | | **Delete** route |
| **TRIPS**|                     |              |               |         |
| GET       | `/api/trips`      |              | Collection of representations of all _trips_  | **List** or **collection** endpoint |
| GET       | `/api/trips/3`   |              | Representation of _trip_ `3` | **Retrieve** endpoint |
| POST      | `/api/trips`      | Representation of a new _trip_  | Description of the result of the operation | **Create** endpoint |
| PUT       | `/api/trips/3`   | Representation of a new version of trip `3` | | **Replace** endpoint |
| DELETE    | `/api/trips/3`   |              | | **Delete** route |
| **HOSTS**|                     |              |               |         |
| GET       | `/api/hosts`      |              | Collection of representations of all _hosts_  | **List** or **collection** endpoint |
| GET       | `/api/hosts/3`   |              | Representation of _host_ `3` | **Retrieve** endpoint |
| POST      | `/api/hosts`      | Representation of a new _host_  | Description of the result of the operation | **Create** endpoint |
| PUT       | `/api/hosts/3`   | Representation of a new version of host `3` | | **Replace** endpoint |
| DELETE    | `/api/hosts/3`   |              | | **Delete** route |
| **MESSAGES**|                     |              |               |         |
| GET       | `/api/messages/3`      |              | Collection of representations of all _messages_  | **List** or **collection** endpoint |
| GET       | `/api/messages/3`   |              | Representation of _message_ `3` | **Retrieve** endpoint |
| POST      | `/api/messages`      | Representation of a new _message_  | Description of the result of the operation | **Create** endpoint |
| PUT       | `/api/messages/3`   | Representation of a new version of message `3` | | **Replace** endpoint |
| DELETE    | `/api/messages/3`   |              | | **Delete** route |
| **TRIP-TRAVELER**|                     |              |               |         |
| GET       | `/api/tripTravelers`      |              | Collection of representations of all _tripTravelers_  | **List** or **collection** endpoint |
| GET       | `/api/tripHostTravelers`      |              | Collection of representations of all _tripHostTravelers_  | **List** or **collection** endpoint |
| GET       | `/api/tripTravelers/3`   |              | Representation of _tripTraveler_ `3` | **Retrieve** endpoint |
| POST      | `/api/trips/3/tripTravelers`      | Representation of a new _tripTraveler_  for trip 3 | Description of the result of the operation | **Create** endpoint |
| PUT       | `/api/tripTravelers/3`   | Representation of a new version of tripTraveler `3` | | **Replace** endpoint |
| DELETE    | `/api/tripTravelers/3`   |              | | **Delete** route |
| **USER**|                     |              |               |         |
| GET       | `/api/users`      |              | Collection of representations of all _users_  | **List** or **collection** endpoint |
| GET       | `/api/users/3`   |              | Representation of _users_ `3` | **Retrieve** endpoint |
| GET       | `/api/userSession`   |              | Representation of _userSession_  | **Retrieve** endpoint |
| POST      | `/api/users`      | Representation of a new _user_  | Description of the result of the operation | **Create** endpoint |
| PUT       | `/api/users/3`   | Representation of a new version of user `3` | | **Replace** endpoint |
| DELETE    | `/api/users/3`   |              | | **Delete** route |
| **USER-PROFILES**|                     |              |               |         |
| GET       | `/api/userProfiles`      |              | Collection of representations of all _userProfiles_  | **List** or **collection** endpoint |
| GET       | `/api/userProfiles/username`   |              | Representation of _userProfile_ `username` | **Retrieve** endpoint |
| GET       | `/api/userProfiles/3`   |              | Representation of _userProfile_ `3` | **Retrieve** endpoint |
| GET       | `/api/homeProfile`   |              | Representation of _homeProfile_  | **Retrieve** endpoint |
| POST      | `/api/userProfiles`      | Representation of a new _userProfile_  | Description of the result of the operation | **Create** endpoint |
| PUT       | `/api/userProfiles/3`   | Representation of a new version of userProfile `3` | | **Replace** endpoint |
| DELETE    | `/api/userProfiles/3`   |              | | **Delete** route |
| **VEHICLE**|                     |              |               |         |
| GET       | `/api/vehicles`      |              | Collection of representations of all _vehicles_  | **List** or **collection** endpoint |
| GET       | `/api/vehicles/user`   |              | Representation of _vehicle_ `user` | **Retrieve** endpoint |
| GET       | `/api/vehicles/3`   |              | Representation of _vehicle_ `3` | **Retrieve** endpoint |
| POST      | `/api/vehicles`      | Representation of a new _vehicle_ | Description of the result of the operation | **Create** endpoint |
| PUT       | `/api/vehicles/3`   | Representation of a new version of vehicle `3` | | **Replace** endpoint |
| DELETE    | `/api/vehicles/3`   |              | | **Delete** route |

### Lessons Learned

### How to Run

You can access the routes above using the following URL: http://3.132.5.31:8080/Caravan/

Some routes are restricted and require a log in or administration privileges. Most features can be accessed after registering. If you would like admin approval, please contact me.

Alternatively, you can compile this program to run on your own localhost or your own EC2 instance. Download or clone this repository to a local directory. Open Spring Tool Suite (or your favorite IDE) and import the Gradle project under the File menu. Alternatively, you can clone the repository directly into your IDE via terminal. Once you have compiled it, click run and follow the prompts.

Clone with SSH:

git@github.com:richardanewman/FinalProjectFork.git

Clone with HTTPS:

https://github.com/richardanewman/FinalProjectFork.git


## Context

Below you will find a copy of the assignment's tasks. I am providing this context for anyone evaluating my code. The project work was performed independently by group members. For better or worse, the code is our own. The only resources referenced were from the prior course material and class notes.

### The Following Task Was Provided by Skill Distillery

## Final Project

## Overview

We have reached the culmination of our Java learning. Now its time to put this knowledge into practice with an all encompassing full stack project. The guidelines for this project are minimal, only dictating schedule and basic technologies that must be used.

Each individual will have a chance to pitch ideas they have for the project. After the pitches, students will have an opportunity to vote on the ideas they like the most. With this information the instructors will review all pitched options and assign groups.

The project must utilize:
* A SQL database  
* Java REST backend  
* A front end JS technology we learned over the course of the program
  * Vanilla JS  
  * Angular  

The project must include:
* Non-authenticated and authenticated views of data.
* Login authentication to access C.R.U.D. functionality.
* Full C.R.U.D. of user-generated data.
* A separate privilege level that can perform C.R.U.D. on data a non-privileged user cannot.


