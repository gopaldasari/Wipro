package Mini;

public class AddSingleBook extends Thread 
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