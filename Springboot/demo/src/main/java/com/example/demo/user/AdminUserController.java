package com.example.demo.user;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

//관리자 기능 
@RequestMapping("/admin")	//공통적으로 붙는 접미사 
@RestController
public class AdminUserController {
	private UserDaoService service;
	
	public AdminUserController(UserDaoService service) {
		this.service = service;	//의존성 주입 
	}
	
	//@GetMapping("/admin/users")
	@GetMapping("/users")
	public MappingJacksonValue retrieveAllUsers(){
		List<User> users = service.findAll();	//코드 분리
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter	//필터로 조회 
				.filterOutAllExcept("id","name","joinDate","password");
		
		FilterProvider filters = new SimpleFilterProvider().addFilter("UserInfo",filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(users);
		mapping.setFilters(filters);
		
		return mapping;	//전체 사용자 목록 
	}
	
	//GET /admin/users/1 -> /admin/v1/users/1	
	//@GetMapping("/v1/users/{id}")	url을 통해서 버전 관리 
	//@GetMapping(value="/users/{id}/",params="version=1")	parameter를 통해 버전 관리
	//@GetMapping(value="/users/{id}",headers="X-API-VERSION=1")	//header를 통해 버전 관리 
	
	@GetMapping(value="/users/{id}",produces="application/vnd.company.appv1+json")	//MIME 이용해서 버전 관리 
	public MappingJacksonValue retrieveUserV1(@PathVariable int id) {	//가변적 
		User user = service.findOne(id);
		if(user == null) {
			throw new UserNotFoundException(String.format("ID[%s] not found", id));
		}
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter	//필터로 조회 
				.filterOutAllExcept("id","name","password","ssn");
		
		FilterProvider filters = new SimpleFilterProvider().addFilter("UserInfo",filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(user);
		mapping.setFilters(filters);
		return mapping;
	}
	
	
	//GET /admin/users/1 -> /admin/v2/users/1	
	//@GetMapping("/v2/users/{id}")	->버전2 / url을 통해서 버전 관리
	//@GetMapping(value="/users/{id}/",params="version=2")	parameter를 통해 버전 관리 (url에는 파라미터를 ?로 구분하여 적어준다.) 
	//@GetMapping(value="/users/{id}",headers="X-API-VERSION=2") header를 통해 버전 관리 
	
	@GetMapping(value="/users/{id}",produces="application/vnd.company.appv2+json")
	public MappingJacksonValue retrieveUserV2(@PathVariable int id) {	//가변적 
		User user = service.findOne(id);
			
		if(user == null) {
			throw new UserNotFoundException(String.format("ID[%s] not found", id));
		}
			
		//User -> User2
		UserV2 userV2 = new UserV2();
		BeanUtils.copyProperties(user, userV2);	//해당 데이터 필드 copy 
		userV2.setGrade("VIP");	//grade 값 설정 
			
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter	//필터로 조회 
			.filterOutAllExcept("id","name","joinDate","Grade");
			
		FilterProvider filters = new SimpleFilterProvider().addFilter("UserInfoV2",filter);
			
		MappingJacksonValue mapping = new MappingJacksonValue(userV2);
		mapping.setFilters(filters);
		return mapping;
	}
}
