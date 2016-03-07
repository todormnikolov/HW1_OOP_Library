
public class Library {

	String name;
	Book[] books;

	public Library(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.equals("")) {
			this.name = "Unnamed Library";
		}
		this.name = name;
	}

	public void addBook(Book book) {

		int length = 0;

		if (this.books != null) {
			length = this.books.length;
		}

		Book[] newBookArray = new Book[length + 1];

		for (int i = 0; i < length; i++) {
			newBookArray[i] = this.books[i];
		}

		newBookArray[length] = book;

		this.books = newBookArray;

	}

	public void searchAndDeleteByAuthor(String author) {

		int counter = 0;

		System.out.println("The books with author " + author + " are: ");
		for (int i = 0; i < books.length; i++) {
			if (books[i].getAuthor().equals(author)) {
				counter++;
				printBookInfo(books[i]);
			}
		}

		deleteBooksByAuthor(author, counter);

	}

	public void printBookInfo(Book book) {
		System.out.printf("ISBN: %s, %s, %s, %s, %s\n", book.getIbsn(), book.getTitle(), book.getAuthor(),
				book.getYear(), book.getPublisher());
	}

	public void printAll() {

		System.out.println("Library name: " + this.name);

		for (int i = 0; i < this.books.length; i++) {
			printBookInfo(this.books[i]);
		}
	}

	public void deleteBook(Book book) {
		int length = this.books.length;

		Book[] newBookArray = new Book[length - 1];

		boolean isDeleted = false;
		for (int i = 0; i < books.length; i++) {
			if (!isDeleted && books[i].getIbsn().equals(book.getIbsn())) {
				isDeleted = true;
				continue;
			} else {
				if (isDeleted) {
					newBookArray[i - 1] = this.books[i];
				} else {
					newBookArray[i] = this.books[i];
				}
			}
		}

		this.books = newBookArray;
	}

	public void deleteBooksByAuthor(String author, int deleteBooksNumber) {

		int length = this.books.length;

		Book[] newBookArray = new Book[length - deleteBooksNumber];

		int counter = 0;
		for (int i = 0; i < length; i++) {
			if (books[i].getAuthor().equals(author)) {
				counter++;
				continue;
			} else {

				newBookArray[i - counter] = this.books[i];
			}
		}

		System.out.println(counter + " books by " + author + " deleted!");
		this.books = newBookArray;
	}

}
