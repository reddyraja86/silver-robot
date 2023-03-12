package com.flyway.demo.Exceptions;

import java.util.Arrays;

import com.flyway.demo.model.User;

import lombok.Data;

@Data
public class UserNotFoundException extends  Exception{

	private static final long serialVersionUID = 1L;
	private User user;

	@Override
	public String toString() {
		return "UserNotFoundException [user=" + user + ", getMessage()=" + getMessage() + ", getLocalizedMessage()="
				+ getLocalizedMessage() + ", getCause()=" + getCause() + ", toString()=" + super.toString()
				+ ", fillInStackTrace()=" + fillInStackTrace() + ", getStackTrace()=" + Arrays.toString(getStackTrace())
				+ ", getSuppressed()=" + Arrays.toString(getSuppressed()) + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	} 
}
