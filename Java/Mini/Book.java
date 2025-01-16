package Mini;

public class Book 
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
