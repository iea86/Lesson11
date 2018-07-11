package by.epam.javabasic25.classes;

//public class Book implements Comparable<Book>{
	
	public class Book {
	
	private String Title;
	private String Author;
	private int YearPublished;
	private int Price;
	
	public Book() {
	}
		
	public Book(String Title,String Author, int YearPublished, int Price) {
	this.Title = Title;
	this.Author = Author;
	this.YearPublished = YearPublished;
	this.Price = Price;
	
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getYearPublished() {
		return YearPublished;
	}

	public void setYearPublished(int yearPublished) {
		YearPublished = yearPublished;
	}
	
	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	} 

		
	public String toString() { 
	      return Title + " by " + Author + " year " + YearPublished + " price" + Price;
	   }

	
	
	
}
	
	
	
	
