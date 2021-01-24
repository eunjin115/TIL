package com.example.demo.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {	//다른 컨트롤러에서 사용할 수 있는 예외 클래스 
	private Date timestamp;
	private String message;
	private String details;
}
