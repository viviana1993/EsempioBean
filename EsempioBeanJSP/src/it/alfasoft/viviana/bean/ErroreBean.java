package it.alfasoft.viviana.bean;

import java.io.Serializable;

public class ErroreBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	
	public ErroreBean() {
		this.message = "";
	}



	public ErroreBean(String message) {
		super();
		this.message = message;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
