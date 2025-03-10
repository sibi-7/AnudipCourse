import java.util.ArrayList;

class Book {
    int bookId;
    String bookName;
    String authorName;

    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId + ", Name: " + bookName + ", Author: " + authorName);
    }
}

public class BookCollection {
    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(new Book(101, "Java Programming", "Herbert Schildt"));
        bookList.add(new Book(102, "Effective Java", "Joshua Bloch"));
        bookList.add(new Book(103, "The Alchemist", "Paulo Coelho"));
        bookList.add(new Book(104, "Clean Code", "Robert C. Martin"));

        System.out.println("Book Collection:");
        for (Book book : bookList) {
            book.displayBookDetails();
        }
    }
}
