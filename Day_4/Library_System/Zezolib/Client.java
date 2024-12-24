package Zezolib;

public class Client {

 public int id ;
 public String name ;
 public String email ;

  public Client(int id , String name , String email )
  {
    this.id = id ;
    this.name = name ;
    this.email = email ;
  }

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
