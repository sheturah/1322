package abstractPractice;

//abstract class
abstract class Item {
	
	private String title;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Item()
	{
		
	}
	public Item(String title) {
		super();
		this.title = title;
	}

	public abstract String getListing();
	

}
