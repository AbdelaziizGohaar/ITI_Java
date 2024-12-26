package Zezolib;

public class Magazine extends LibraryItem{
 public String issue ;
   public Magazine(int id , String title , String issue )
   {
    super(id, title) ;
    this.issue = issue ;
   }


    @Override
    public String getItemDetailes() {
        return "Book [ID: " + getId() + " ]" + "[ Title: " + getTitle() + "]" + "[ Issue: " + issue + "]";
    }

    
}
