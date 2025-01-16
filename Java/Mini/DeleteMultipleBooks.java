package Mini;

import java.util.List;

public class DeleteMultipleBooks extends Thread 
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
