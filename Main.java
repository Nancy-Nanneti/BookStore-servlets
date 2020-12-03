package com.bookstore.model;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		BookDao dao = new BookDaoImpl();
		//List<Book> books = dao.getAll();
		//books.forEach(b -> System.out.println(b));
		
		//get book by id
    //Book book = dao.getById(2);
   //System.out.println(book);
		
		//add 
    //Book book = new Book("A5B8", "Java Beginners", "Nancy", 1000);
		//dao.add(book);
		
		//update price
		dao.update(3, 2000);
		System.out.println("done");
		
		//del book
    //dao.delete(1);
		
		
	}

}
