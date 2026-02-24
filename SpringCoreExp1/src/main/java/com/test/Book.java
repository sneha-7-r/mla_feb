package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

public class Book {
	private int id;
	private String b_name;
	private String b_author;
	private int price;
	@Autowired 
	private List<BookDetails> listbd;
	
	public List<BookDetails> getListbd() {
		return listbd;
	}
	public void setListbd(List<BookDetails> listbd) {
		this.listbd = listbd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
    }
	@Override
	public String toString() {
		return "Book [id=" + id + ", b_name=" + b_name + ", b_author=" + b_author + ", price=" + price + ",\nlistbd="
				+ listbd + "]";
	}
}
