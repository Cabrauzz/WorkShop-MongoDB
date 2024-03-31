package com.cabral.workshopmongo.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long timesttamp;
	private Integer status;
	private String erros;
	private String message;
	private String path;
	
	public StandardError() {
		
	}

	public StandardError(Long timesttamp, Integer status, String erros, String message, String path) {
		this.timesttamp = timesttamp;
		this.status = status;
		this.erros = erros;
		this.message = message;
		this.path = path;
	}

	public Long getTimesttamp() {
		return timesttamp;
	}

	public void setTimesttamp(Long timesttamp) {
		this.timesttamp = timesttamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getErros() {
		return erros;
	}

	public void setErros(String erros) {
		this.erros = erros;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
