package by.epam.javabasic25.classes;

import java.util.Comparator; 

public class PriceCompare implements Comparator<Book> { 
   public int compare(Book b1, Book b2) { 
 
	   return b1.getPrice() - b2.getPrice();
	   
   } 
}