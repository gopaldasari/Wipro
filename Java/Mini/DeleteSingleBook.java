package Mini;

public class DeleteSingleBook extends Thread 
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