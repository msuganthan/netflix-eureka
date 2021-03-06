package org.sugathan.controller;

public class MessageWrapper<T> {

	private T wrapped;
	private String message;
	
	public MessageWrapper(T wrapped, String message) {
		this.wrapped = wrapped;
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public T getWrapped() {
		return wrapped;
	}
	
}
