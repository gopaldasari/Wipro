package Mini;

public class UpdateBookTitle extends Thread 
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