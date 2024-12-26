package Zezolib;

import java.util.ArrayList;
import java.util.List;

public class Client {

 public int id ;
 public String name ;
 public String email ;
 public List<LibraryItem> ClientBorrowList = new ArrayList<>();

 public String returnItem (int Id) throws ItemNotFoundException
 {
 String RemoveItem = "" ;
 for (LibraryItem item : ClientBorrowList) 
 {
   if(item.getId() == Id )
   {
     RemoveItem = item.getTitle() ;
     ClientBorrowList.remove(item);
     return " Client" + RemoveItem +"is Removed " ;   
    }
 }
 throw new ItemNotFoundException("item with ID " + id + " not found.");
 }
 


 public void displayBorrowedItems() 
 {
     for (LibraryItem item : ClientBorrowList) 
    {
         System.out.println(item.getItemDetailes());
         System.out.println("-------------------------------------------");
    }
    System.out.println("=========================================================");
 }



  public void addBorrowedItem(LibraryItem item) 
  {
   ClientBorrowList.add(item);
  }

  public Client(int id , String name , String email )
  {
    this.id = id ;
    this.name = name ;
    this.email = email ;
    ClientBorrowList = new ArrayList<>();  }

  public void getClientDetails()
  {
    System.out.println("ID = "+ id +" Name = "+ name +" Email = "+email  );
  }

   /*
   5. Implement a menu system to provide CRUD (Create, Read, Update, Delete) functionalities for:
   - Library items (e.g., add books/magazines, retrieve item details, update or delete items).
   - Library clients (e.g., add clients, retrieve client details, update or delete clients).
    */


   
 

}
