package com.springProject.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springProject.course.entities.User;
import com.springProject.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get(); //obj.get porque o get vai retornar o objeto do tipo User que tiver dentro do Optional
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
}
