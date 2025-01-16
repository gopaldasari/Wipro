package Mini;


import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class BookStore 
{
    private List<Book> books = new ArrayList<>();
    
    // Synchronizing method to add multiple books
    public synchronized void addMultipleBooks(List<Book> newBooks) 
    {
        books.addAll(newBooks);
        System.out.println(Thread.currentThread().getName() + " Added " + newBooks.size() + " books.");
    }
    
    // Synchronizing method to delete a single book
    public synchronized void deleteSingleBook(int bookId) 
    {
        books.removeIf(book -> book.getId() == bookId);
        System.out.println(Thread.currentThread().getName() + " Deleted book with ID: " + bookId);
    }
    
    // Synchronizing method to add a single book
    public synchronized void addSingleBook(Book book) 
    {
        books.add(book);
        System.out.println(Thread.currentThread().getName() + " Added book: " + book);
    }

    // Synchronizing method to delete multiple books
    public synchronized void deleteMultipleBooks(List<Integer> bookIds) 
    {
        books.removeIf(book -> bookIds.contains(book.getId()));
        System.out.println(Thread.currentThread().getName() + " Deleted multiple books with IDs: " + bookIds);
    }

    // Synchronizing method to update the title of a book
    public synchronized void updateBookTitle(int bookId, String newTitle) 
    {
        for (Book book : books) 
        {
            if (book.getId() == bookId) 
            {
                book.setTitle(newTitle);
                System.out.println(Thread.currentThread().getName() + " updated book ID " + bookId + " to title: " + newTitle);
                return;
            }
        }
        System.out.println(Thread.currentThread().getName() + " failed to find book with ID: " + bookId);
    }

    // Display all books
    public void displayBooks() 
    {
        System.out.println("Books in the store: " + books);
    }
}
