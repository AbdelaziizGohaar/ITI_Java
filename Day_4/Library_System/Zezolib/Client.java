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
     Design a class hierarchy for library clients:
   - Create a `Client` class with properties like `id`, `name`, and `email`.
   - Add a method `getClientDetails()` to display client information.
 
     */
    
}
