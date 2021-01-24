package com.example.demo.user;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {
	private UserDaoService service;
	
	public UserController(UserDaoService service) {
		this.service = service;	//의존성 주입 
	}
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.findAll();	//전체 사용자 목록
	}
	
	//GET /users/1 or /users/10  -> String으로 전달되지만 int로 convert,,, 
	@GetMapping("/users/{id}")
	public EntityModel<User> retrieveUser(@PathVariable int id) {	//가변적 
		User user = service.findOne(id);
		if(user == null) {
			throw new UserNotFoundException(String.format("ID[%s] not found", id));
		}
		
		//HATEOAS
		EntityModel<User> model = new EntityModel<>(user);
		WebMvcLinkBuilder linkTo = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).retrieveAllUsers());	
		//유저 값 반환 시킬 때 유저가 사용할 수 있는 추가적인 정보를 하이퍼 미디어 형식으로 추가 
		model.add(linkTo.withRel("all-user"));
		return model;
	}
	
	//CREATED
	//input - details of user
	//output - CERATED & Return the created URI
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {	//valid check -> 이름 한 글자 이상 
		User savedUser = service.save(user);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(savedUser.getId())
			.toUri();	//URI 주소 리턴 
		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		User user = service.deleteById(id);
		
		if(user == null) {
			throw new UserNotFoundException(String.format("ID[%s] not found", id));
		}
	}
	
}
