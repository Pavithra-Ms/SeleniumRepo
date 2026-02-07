package week_1.Day2Assignments;

//Library.java
public class Library {

 // Method to add a book
 public String addBook(String bookTitle) {
     System.out.println("Book added successfully");
     return bookTitle;
 }

 // Method to issue a book//not return type
 public void issueBook() {
     System.out.println("Book issued successfully");
 }

 // Main method to test within the same class
 public static void main(String[] args) {
     Library lib = new Library();

     // Call addBook method
     String addBook = lib.addBook("Test Leaf for Selenium");
     System.out.println("Added Book Title: " + addBook);

     // Call issueBook method
     lib.issueBook();
 }
}
