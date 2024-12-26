package Zezolib;

public abstract class LibraryItem
{
 private int id ;
 private String title ;
 public boolean Stock ;

 public LibraryItem()
 {

 }
 public LibraryItem(int id, String title) {
    this.id = id;
    this.title = title;
    this.Stock = true;
 }

 public int getId()  {
    return id;
}

public String getTitle() {
    return title;
}


 abstract public String getItemDetailes();

}


