package Zezolib;

public class Book extends LibraryItem {

  public Book(int id, String title)
  {
    super(id, title);
  }


    @Override
    public String getItemDetailes() {
        return "Book [ID: " + getId() + " ]" + "[ Title: " + getTitle() + "]";
       // throw new UnsupportedOperationException("Unimplemented method 'getItemDetailes'");
    }
    

}