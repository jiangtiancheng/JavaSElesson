package com.tentac.lesson6;

public class BookType {

	private String type_id;
	private String type_name;
	private String type_des;
	
	public BookType() {
		super();
	}

	public BookType(String type_id, String type_name) {
		super();
		this.type_id = type_id;
		this.type_name = type_name;
	}

	public BookType(String type_id, String type_name, String type_des) {
		super();
		this.type_id = type_id;
		this.type_name = type_name;
		this.type_des = type_des;
	}

	public String getType_id() {
		return type_id;
	}

	public String getType_name() {
		return type_name;
	}

	public String getType_des() {
		return type_des;
	}
	
	
}
