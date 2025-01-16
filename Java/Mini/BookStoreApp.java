package Mini;

import java.util.List;

public class BookStoreApp 
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
