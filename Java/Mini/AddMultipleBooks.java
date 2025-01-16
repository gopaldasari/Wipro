package Mini;

import java.util.List;

public class AddMultipleBooks extends Thread 
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