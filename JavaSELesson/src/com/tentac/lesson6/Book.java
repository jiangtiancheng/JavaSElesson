package com.tentac.lesson6;

public class Book {

	private String b_id;
	private String b_name;
	private String b_author;
	private double b_price;
	private String b_color;
	private String b_publisher;
	private BookType bt;
	public Book(String b_id, String b_name, String b_author, double b_price, String b_color, String b_publisher, BookType bt) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.b_author = b_author;
		this.b_price = b_price;
		this.b_color = b_color;
		this.b_publisher = b_publisher;
		this.bt = bt;
	}
	public Book() {
		super();
	}
	public Book(String b_id, String b_name, double b_price, BookType bt) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.b_price = b_price;
		this.bt = bt;
	}
	public String getB_id() {
		return b_id;
	}
	public void setB_id(String b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public String getB_author() {
		return b_author;
	}
	public void setB_author(String b_author) {
		this.b_author = b_author;
	}
	public double getB_price() {
		return b_price;
	}
	public void setB_price(double b_price) {
		this.b_price = b_price;
	}
	public String getB_color() {
		return b_color;
	}
	public void setB_color(String b_color) {
		this.b_color = b_color;
	}
	public String getB_publisher() {
		return b_publisher;
	}
	public void setB_publisher(String b_publisher) {
		this.b_publisher = b_publisher;
	}
	public BookType getBt() {
		return bt;
	}
	public void setBt(BookType bt) {
		this.bt = bt;
	}
	
	
}
