
public class LibraryDemo {

	public static void main(String[] args) {

		Book book1 = new Book("It", "Stephen King", "Pub Copr", 1986, "3903298239829");
		Book book2 = new Book("Rage", "Stephen King", "Pub Copr", 1977, "3203298239823");
		Book book3 = new Book("The alchemist", "Paulo Coeilho", "Pub Copr", 1988, "3903298239889");
		Book book4 = new Book("Steelhearh", "Brandon Sanderson", "Pub Copr", 2013, "3913298232389");
		Book book5 = new Book("The mist", "Stephen King", "Pub Copr", 1984, "9329823982389");

		Library lib = new Library("My library");
		lib.addBook(book1);
		lib.addBook(book2);
		lib.addBook(book3);
		lib.addBook(book4);
		lib.addBook(book5);

		lib.printAll();
		lib.searchAndDeleteByAuthor("Stephen King");
		
		lib.printAll();
	}

}
