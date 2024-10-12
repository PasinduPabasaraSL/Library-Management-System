import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dbName = "admin";
        int dbPassword = 1234;

        boolean isLogged = loginToLms(dbName, dbPassword, input);

        if (isLogged) {
            while (true) {
                System.out.println();
                System.out.println("1. Add Book\n2. Update Book\n3. Remove Book\n4. Display Books\n5. Search Books By Author\n6. Exit");
                System.out.println();
                System.out.print("Choose an option: ");
                int option = input.nextInt();
                System.out.println();
                boolean isBookExist = false;

                switch (option) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = input.nextInt();
                        input.nextLine();
                        System.out.print("Enter title: ");
                        String title = input.nextLine();
                        System.out.print("Enter author: ");
                        String author = input.nextLine();
                        System.out.print("Enter year: ");
                        int year = input.nextInt();
                        Book book = new Book(id, title, author, year);
                        isBookExist = isBookAlreadyExists(book.getId()); //check the book not exist
                        if (isBookExist) {
                            System.out.println("Book already exists!");
                        } else {
                            LibraryManager.addBook(book);
                        }
                        break;

                    case 2:
                        System.out.print("Enter ID of the book to update: ");
                        int bookId = input.nextInt();
                        isBookExist = isBookAlreadyExists(bookId);
                        if (isBookExist) {
                            System.out.print("Enter new Title: ");
                            String updatedTitle = input.next();
                            System.out.print("Enter new Author: ");
                            String updatedAuthor = input.next();
                            System.out.print("Enter new Year: ");
                            int updatedYear = input.nextInt();
                            LibraryManager.updateBook(bookId, updatedTitle, updatedAuthor, updatedYear);
                        } else {
                            System.out.println("Book does not exist!");
                        }
                        break;

                    case 3:
                        System.out.print("Enter ID of the book to remove: ");
                        int removeId = input.nextInt();
                        isBookExist = isBookAlreadyExists(removeId);
                        if (isBookExist) {
                            LibraryManager.removeBook(removeId);
                        } else {
                            System.out.println("Book does not exist!");
                        }
                        break;

                    case 4:
                        LibraryManager.displayBooks();
                        break;

                    case 5:
                        input.nextLine();
                        System.out.print("Enter Author search: ");
                        String search = input.nextLine();
                        LibraryManager.searchBooksByAuthor(search);
                        break;

                    case 6:
                        System.exit(0); //terminate the program

                    default:
                        System.out.println("Invalid option");
                        break;
                }
            }
        }

    }

    public static boolean loginToLms(String dbName, int dbPassword, Scanner input) { //Login to the System
        int loginAttempts = 0;
        boolean loggedIn = false;
        while (true) {
            System.out.print("Enter Username: ");
            String username = input.next();
            System.out.print("Enter Password: ");
            int password = input.nextInt();

            if (username.equals(dbName) && password == dbPassword && loginAttempts < 3) {
                loggedIn = true;
                break;
            } else if (loginAttempts == 2) {
                System.out.println("Maximum login attempts exceeded.");
                break;
            } else {
                System.out.print("Invalid Credentials. Try Again (y/n)? : ");
                char answer = input.next().charAt(0);
                if (answer == 'n' || answer == 'N') {
                    break;
                } else if (answer == 'y' || answer == 'Y') {
                    loginAttempts++;
                } else {
                    System.out.println("Invalid choice.");
                    break;
                }
            }
        }

        return loggedIn;
    }

    public static boolean isBookAlreadyExists(int id) { //check the book exist or not exist
        boolean exists = false;

        ArrayList<Book> books = LibraryManager.getBooks();

        for (Book book : books) {
            if (book.getId() == id) {
                exists = true;
                break;
            }
        }

        return exists;
    }

}
