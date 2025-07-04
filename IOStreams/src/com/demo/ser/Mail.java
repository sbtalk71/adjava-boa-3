package com.demo.ser;

import java.io.Serializable;

public class Mail implements Serializable{

	private String toAddress;
	private String fromAddress;
	private String message;

	public Mail() {
		// TODO Auto-generated constructor stub
	}

	public Mail(String toAddress, String fromAddress, String message) {
		this.toAddress = toAddress;
		this.fromAddress = fromAddress;
		this.message = message;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
