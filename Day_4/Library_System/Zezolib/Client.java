package Zezolib;

import java.util.ArrayList;
import java.util.List;

public class Client {

 public int id ;
 public String name ;
 public String email ;
 public List<? extends LibraryItem> ClientList = new ArrayList<>(); 


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


     public  void  addClient(int id, String name, String email) 
    {
      Client c = new Client(id, name, email);
      ClientList.add(c);
     // return new Client(id, name, email);
    }


    public void displayClients() 
  {
    for (Client client : ClientList) 
    {
      System.out.println(client.getClientDetails());
    }
  }
 
  public String deletClient(int Id)
  {
    for (Client client : ClientList) 
    {
      if(client.id == Id )
      {
        clients.Delete(client);
      }
    }
    return "This Client is Removed "+client.getClientDetails();
  }

}
