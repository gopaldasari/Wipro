package pack9;

import java.util.ArrayList;
import java.util.List;

class Book 
{
    private String title;
    private int id;

    public Book(int id, String title) 
    {
        this.id = id;
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }

    public int getId() 
    {
        return id;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    @Override
    public String toString() 
    {
       return id + "." + title ;
        //return title;
    }
}

class BookStore 
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
                System.out.println(Thread.currentThread().getName() + " Updated book ID " + bookId + " to title: " + newTitle);
                return;
            }
        }
        System.out.println(Thread.currentThread().getName() + " Failed to find book with ID: " + bookId);
    }

    // Display all books
    public void displayBooks() 
    {
        System.out.println("Books in the store: " + books);
    }
}

class AddMultipleBooks extends Thread 
{
    private BookStore store;
    private List<Book> booksToAdd;

    public AddMultipleBooks(BookStore store, List<Book> booksToAdd) 
    {
        this.store = store;
        this.booksToAdd = booksToAdd;
    }

    @Override
    public void run() 
    {
        store.addMultipleBooks(booksToAdd);
        store.displayBooks();
    }
}

class DeleteSingleBook extends Thread 
{
    private BookStore store;
    private int bookId;

    public DeleteSingleBook(BookStore store, int bookId) 
    {
        this.store = store;
        this.bookId = bookId;
    }

    @Override
    public void run() 
    {
        store.deleteSingleBook(bookId);
        store.displayBooks();
    }
}

class AddSingleBook extends Thread 
{
    private BookStore store;
    private Book bookToAdd;

    public AddSingleBook(BookStore store, Book bookToAdd) 
    {
        this.store = store;
        this.bookToAdd = bookToAdd;
    }

    @Override
    public void run() 
    {
        store.addSingleBook(bookToAdd);
        store.displayBooks();
    }
}

class DeleteMultipleBooks extends Thread 
{
    private BookStore store;
    private List<Integer> bookIds;

    public DeleteMultipleBooks(BookStore store, List<Integer> bookIds) 
    {
        this.store = store;
        this.bookIds = bookIds;
    }

    @Override
    public void run() 
    {
        store.deleteMultipleBooks(bookIds);
        store.displayBooks();
    }
}

class UpdateBookTitle extends Thread 
{
    private BookStore store;
    private int bookId;
    private String newTitle;

    public UpdateBookTitle(BookStore store, int bookId, String newTitle) 
    {
        this.store = store;
        this.bookId = bookId;
        this.newTitle = newTitle;
    }

    @Override
    public void run() 
    {
        store.updateBookTitle(bookId, newTitle);
        store.displayBooks();
    }
}

public class BookStoreApp1 
{
    public static void main(String[] args) 
    {
        BookStore store = new BookStore();
        
        List<Book> booksToAdd = List.of(new Book(1, "Java Basics"), new Book(2, "Advanced Java"),new Book(3, "Spring Framework"), new Book(4, "AWS"));
        //List<Book> moreBooks = List.of(new Book(3, "Spring Framework"), new Book(4, "Hibernate"));
        store.displayBooks();
        List<Integer> booksToDelete = List.of(1, 3);
        
        AddMultipleBooks thread1 = new AddMultipleBooks(store, booksToAdd);
        AddSingleBook thread2 = new AddSingleBook(store, new Book(5, "Microservices"));
        DeleteSingleBook thread3 = new DeleteSingleBook(store, 2);
        DeleteMultipleBooks thread4 = new DeleteMultipleBooks(store, booksToDelete);
        UpdateBookTitle thread5 = new UpdateBookTitle(store, 1, "Java in depth");
        
        // Start threads
        thread1.start();
        thread1.setName("Thread 1 : ");
        thread2.start();
        thread2.setName("Thread 2 : ");
        thread3.start();
        thread3.setName("Thread 3 : ");
        thread4.start();
        thread4.setName("Thread 4 : ");
        thread5.start();
       
        thread5.setName("Thread 5 : ");
        
        try 
        {
            // Wait for all threads to finish
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
           
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        // Display all books in store
        System.out.println("After All Threads Got Executed ");
        store.displayBooks();
    }
}
