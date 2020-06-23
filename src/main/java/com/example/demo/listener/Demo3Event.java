package com.example.demo.listener;

import org.springframework.context.ApplicationEvent;


public class Demo3Event extends ApplicationEvent{
	private static final long serialVersionUID = 1L;
	
	private String message;

	public Demo3Event(Object source) {
		super(source);
	}
	
	public Demo3Event(Object source, String message) {
		super(source);
		this.message = message;
	}






	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
