package com.example.demo.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok 
@Data
@AllArgsConstructor	//lombok의 이 Annotation을 통해 생성자도 만들지 않아도 된다 
@NoArgsConstructor	//Default 생성자 
//Annotation과 생성자 중복되면 에러난다 
public class HelloWorldBean {
	private String message;
	
	/*public String getMessage() {
		return this.message;
	}
	public void setMessage(String msg)
	{
		this.message = msg;
	}*/	//lombok의 Annotation을 사용하기 때문에 쓰지 않아도 된다 
	
	/*public HelloWorldBean(String message) {
		
	}
*/
}
