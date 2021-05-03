
public class BookData {
private String title;
private int price;
private String writer;

public BookData() {
}

public BookData(String title, int price, String writer) {
	
	this.title = title;
	this.price = price;
	this.writer = writer;
}

public String getTitle() {
	return title;
}

public int getPrice() {
	return price;
}

public String getWriter() {
	return writer;
}

}
