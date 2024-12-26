package Zezolib;

public class Book extends LibraryItem {

 public String author ;
  public Book(int id, String title, String author)
  {
    super(id, title);
    this.author = author ;
  }


    @Override
    public String getItemDetailes() {
        return "Book [ID: " + getId() + " ]" + "[ Title: " + getTitle() +  "]" + "[ Author : " + author +  "]" ;
    }
    

}