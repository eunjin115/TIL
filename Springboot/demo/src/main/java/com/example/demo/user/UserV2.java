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
@NoArgsConstructor
//@JsonIgnoreProperties(value= {"password"})	//변수말고 클래스 전체에 적용 
@JsonFilter("UserInfoV2")
public class UserV2 extends User {	//User 상속받아서 구현 
	private String grade;
}
