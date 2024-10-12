import java.util.ArrayList;

public class LibraryManager {
    static int bookIndex = 0;
    static ArrayList<Book> books = new ArrayList<Book>();

    public static void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
        bookIndex++;
    }

    public static void updateBook(int id, String title, String author, int year) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.set(i,new Book(id,title,author,year));
                System.out.println("Book updated successfully.");
                break;
            }
        }
    }

    public static void removeBook(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.remove(i);
                System.out.println("Book removed successfully.");
                break;
            }
        }
    }

    public static void displayBooks() {
        boolean isEmpty = true;
        for (Book book : books) {
            if (book != null) {
                System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Year: " + book.getYear());
                isEmpty = false;
            }
        }

        if (isEmpty) {
            System.out.println("No books found.");
        }

    }

    public static void searchBooksByAuthor(String author) {
        boolean isEmpty = true;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Year: " + book.getYear());
                isEmpty = false;
            }
        }

        if (isEmpty) {
            System.out.println("No books found written by this author.");
        }

    }

    public static ArrayList<Book> getBooks() { //get ArrayList to check book exist or not
        return books;
    }

}
