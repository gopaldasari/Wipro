package pack9;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<String> books = new ArrayList<>();

    // Method to add multiple books
    public synchronized void addMultipleBooks(List<String> newBooks) {
        System.out.println("Adding multiple books...");
        books.addAll(newBooks);
        System.out.println("Added multiple books: " + newBooks);
    }

    // Method to delete a single book
    public synchronized void deleteSingleBook(String bookName) {
        System.out.println("Deleting single book: " + bookName);
        books.remove(bookName);
        System.out.println("Deleted single book: " + bookName);
    }

    // Method to add a single book
    public synchronized void addSingleBook(String newBook) {
        System.out.println("Adding single book: " + newBook);
        books.add(newBook);
        System.out.println("Added single book: " + newBook);
    }

    // Method to delete multiple books
    public synchronized void deleteMultipleBooks(List<String> booksToDelete) {
        System.out.println("Deleting multiple books...");
        books.removeAll(booksToDelete);
        System.out.println("Deleted multiple books: " + booksToDelete);
    }

    // Method to update a book title
    public synchronized void updateBookTitle(String oldTitle, String newTitle) {
        System.out.println("Updating book title: " + oldTitle + " to " + newTitle);
        int index = books.indexOf(oldTitle);
        if (index != -1) {
            books.set(index, newTitle);
            System.out.println("Updated book title successfully.");
        } else {
            System.out.println("Book not found for update.");
        }
    }

    // Main method to simulate the book operations with threads
    public static void main(String[] args) {
        Library library = new Library();

        // Create threads for each reader
        Thread reader1 = new Thread(() -> {
            library.addMultipleBooks(List.of("Book1", "Book2", "Book3"));
        });

        Thread reader2 = new Thread(() -> {
            library.deleteSingleBook("Book2");
        });

        Thread reader3 = new Thread(() -> {
            library.addSingleBook("Book4");
        });

        Thread reader4 = new Thread(() -> {
            library.deleteMultipleBooks(List.of("Book1", "Book3"));
        });

        Thread reader5 = new Thread(() -> {
            library.updateBookTitle("Book4", "UpdatedBook4");
        });

        // Start the threads
        reader1.start();
        reader2.start();
        reader3.start();
        reader4.start();
        reader5.start();

        // Wait for all threads to finish
        try {
            reader1.join();
            reader2.join();
            reader3.join();
            reader4.join();
            reader5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display final state of the library
        System.out.println("Final list of books: " + library.books);
    }
}
