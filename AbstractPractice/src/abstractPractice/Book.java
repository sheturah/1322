package abstractPractice;

//child class
public class Book extends Item{
	
	private double ISBN;
	private String author;
	
	public Book()
	{
		
	}
	
	
	public Book(String title, double iSBN, String author) {
		super(title);
		this.ISBN = iSBN;
		this.author = author;
		
	}


	public double getISBN() {
		return ISBN;
	}


	public void setISBN(double iSBN) {
		ISBN = iSBN;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public String getListing()
	{
		String statement = "Book Name - " + getTitle() + "\nAuthor - " + getAuthor() + "\nISBN # - " + getISBN();
		return statement;
	}
}
