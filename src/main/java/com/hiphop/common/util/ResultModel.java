package com.hiphop.common.util;

public class ResultModel {
	
	private int code;
	private String message;
	private Object data;
	
	public ResultModel(int code,String message,Object data){
		this.code=code;
		this.message=message;
		this.data=data;
	}
	
	public ResultModel(R r,Object data){
		this.code=r.getCode();
		this.message=r.getMessage();
		this.data=data;
	}
	
	public ResultModel(R r){
		this.code=r.getCode();
		this.message=r.getMessage();
	}
	

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
}
