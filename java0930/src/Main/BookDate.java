package Main;

public class BookDate {
	
	private String title;
	private int price;
	private String writer;
	
	public void BookData() {}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}


	
	public BookDate(String title, int price, String writer) {
		super();
		this.title = title;
		this.price = price;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "BookData [title=" + title + ", price=" + price + ", writer=" + writer + "]";
	}
	
	
	

}



