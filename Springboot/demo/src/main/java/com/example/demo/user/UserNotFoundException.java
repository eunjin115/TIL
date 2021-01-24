package com.example.demo.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//2xx -> OK
//4xx -> Client mistake
//5xx -> Server mistake 

//이 예외 코드는 500번대 오류가 아닌 400번대의 오류로 나오게 된다. (404 Not Found) 
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String message) {
		super(message);
	}
}
