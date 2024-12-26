package Zezolib;
import java.util.ArrayList;
import java.util.List;

public class Library
//class Library < T extends LibraryItem> 
 {
   // List <T>items;
    public List<LibraryItem> Shelfes = new ArrayList<>(); 
    public List<Client> ClientList = new ArrayList<>(); 

 //    private List<T> items = new ArrayList<>();
 //public static void add(List <? extends LibraryItem> list) 
 //{
 //}

   public Library()
   {
    Shelfes = new ArrayList<>();
   }

 //public void addItem(T item) {
 //   Shelfes.add(item);
 //}

 public void addItem(LibraryItem item) 
 {
    // Cast Shelfes to a List<LibraryItem> for adding
    Shelfes.add(item);
 }


 public LibraryItem findItemById(int id) throws ItemNotFoundException 
 {
    for (LibraryItem item : Shelfes)
    {
        if (item.getId()==id) 
        {
            return item;
        }
    }
    throw new ItemNotFoundException("Item with ID " + id + " not found.");
 }

 public LibraryItem _findItemById(int id) throws ItemNotFoundException {
    for (LibraryItem item : Shelfes) {
        if (item.getId() == id) {
            return item;
        }
    }
    throw new ItemNotFoundException("Item with ID " + id + " not found.");
}


 public void displayItems() 
 {
     for (LibraryItem item : Shelfes) 
    {
         System.out.println(item.getItemDetailes());
    }
 }


 public void updateItem(int id, LibraryItem newItem) throws ItemNotFoundException {
    for (int i = 0; i < Shelfes.size(); i++) {
        if (Shelfes.get(i).getId()==id) {
            Shelfes.set(i, newItem);
            return;
        }
    }
    throw new ItemNotFoundException("Item with ID " + id + " not found.");
}


public void deleteItem(int id) throws ItemNotFoundException {
    LibraryItem item = findItemById(id);
    Shelfes.remove(item);
}

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
  client.getClientDetails();
}
}

public String deletClient(int Id)
{
String RemoveClient = "" ;
for (Client client : ClientList) 
{
  if(client.id == Id )
  {
    RemoveClient = client.name ;
    ClientList.remove(client);
  }
}
return " Client" + RemoveClient +"is Removed " ;
}


public Client findClientById(int id) throws ItemNotFoundException 
{
 for (Client item : ClientList)
 {
    if (item.id == id) 
    {
         return item;
    }
 }
 throw new ItemNotFoundException("Client with ID " + id + " not found.");
}


} /////// end of class

