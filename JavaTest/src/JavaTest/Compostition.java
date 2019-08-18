package JavaTest;

import java.util.ArrayList;
import java.util.List;

public class Compostition {

	public static void main(String[] args) {
		Book b1 = new Book ("Java1", "xyz");
		Book b2 = new Book ("Java2", "xyz");
		Book b3 = new Book ("Java3", "xyz");
		
		List<Book> books = new ArrayList<>();
		books.add(b1);
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		Library l = new Library(books);
		List<Book> bks = l.getTotalBooksInLibrary();
		for (Book bk : bks) {
			System.out.println("Title "+ bk.title+"\n"+ " Author "+bk.author);
		}
		
	}

}
