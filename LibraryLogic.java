package by.epam.javabasic25.classes;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class LibraryLogic {
		
 			  		 
	public int IsBookInLibrary(Library library, String AuthorToFind, String SortOption){		 ///to find the book in the library by Author
		 int numb;
		 numb = 0;
		 List<Book> books = library.getBook(); 
		 
		//to sort by year/price	
		if (SortOption=="Year") {
			 Collections.sort(books,new YearCompare());
		 } else {
			 Collections.sort(books,new PriceCompare());
		 }
		
		
		//to find the books
			 System.out.println("-----------------------------------");
			 System.out.println("  Author     Book     Year   Price");				   
			 System.out.println("------------------------------------");		 
		 
		 for (Book bk : books) {
			   if (bk.getAuthor()==AuthorToFind)  {
				   numb = numb + 1;
				   		   
				   System.out.println(bk.getAuthor()+"  "+ bk.getTitle()+"  " + bk.getYearPublished()+"  " + bk.getPrice());	 				   
			   }
			   
		 }
			   
			  
		 if (numb == 0 ) {
			 System.out.println("There is no book of this Author in the library");	        
		   }
		
		 		 
		 return numb;	
	}
}


		 
	
	