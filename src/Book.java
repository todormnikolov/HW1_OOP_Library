
public class Book {

	private String title;
	private String author;
	private String publisher;
	private int year;
	private String ibsn;

	public Book(String title, String aut, String pub, int year, String isbn) {
		setTitle(title);
		setAuthor(aut);
		setPublisher(pub);
		setYear(year);
		setIbsn(isbn);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getIbsn() {
		return ibsn;
	}

	public void setIbsn(String ibsn) {
		this.ibsn = ibsn;
	}

}
