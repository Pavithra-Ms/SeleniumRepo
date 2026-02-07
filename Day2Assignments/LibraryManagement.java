package week_1.Day2Assignments;

public class LibraryManagement {

	public static void main(String[] args) {
	     Library lib = new Library();

	     // Call addBook method
	     String addedBook = lib.addBook("Test Leaf for Selenium");
	     System.out.println("Added Book Title: " + addedBook);

	     // Call issueBook method
	     lib.issueBook();
	}

}
