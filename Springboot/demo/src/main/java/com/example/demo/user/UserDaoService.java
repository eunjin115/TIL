package com.example.demo.user;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service	//어떤 용도로 사용할 것인지 bean의 용도를 정확하게 정한다. 
public class UserDaoService {
	private static List<User> users = new ArrayList<>();
	private static int usersCount = 3;
	
	static {
		users.add(new User(1,"Kate",new Date(),"pass1","990115-2222222"));
		users.add(new User(2,"Thor",new Date(),"pass2","000000-0000000"));
		users.add(new User(3,"Stark",new Date(),"pass3","700529-1111111"));
		//users.add(new User(id:1,name:"eunjin",new Date())); -> error
	}
	
	public User save(User user) {	//유저 추가
		if(user.getId() == null) {	//같은 id를 가진 유저가 없다면 
			user.setId(++usersCount);	
		}
		users.add(user);
		return user;
	}
	
	public List<User> findAll(){
		return users;
	}
	public User findOne(int id) {	//특정 id 가지고 찾기
		for (User user : users) {
			if(user.getId() == id)
				return user;
		}
		return null;
	}
	public User deleteById(int id) {
		Iterator<User> iterator  = users.iterator();	//순차적으로 접근하기 위해 열거형으로 변환
		while(iterator.hasNext()) {
			User user = iterator.next();
			
			if(user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
		
	}
}
