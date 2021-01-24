package com.example.demo.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;	//validation -> 유효성 검사 

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor	//추가 생성자 쓸 필요 없음
//@JsonIgnoreProperties(value= {"password"})	//변수말고 클래스 전체에 적용 
@NoArgsConstructor	//default 생성자 만들어 준다. 
//@JsonFilter("UserInfo") -> HATEOAS 적용 했을 때 에러 발생 (필터링 관련 해서 코드 추가 안했기 때문에) 
public class User {
	private Integer id;
	
	@Size(min=2, message = "Name은 2글자 이상 입력해 주세요. ")
	private String name;
	@Past
	private Date joinDate;
	
	private String password;
	private String ssnl;
}
