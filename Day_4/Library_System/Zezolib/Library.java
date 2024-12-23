package Zezolib;
import java.util.ArrayList;
import java.util.List;

//public class Library {
class Library < T extends LibraryItem> 
 {
    List <T>items;
 //    private List<T> items = new ArrayList<>();
 ////////////////////////////////////////////////////////////////////    
 //public static void add(List <? extends LibraryItem> list) 
 //{
 //}

   public Library()
   {
    items = new ArrayList<>();
   }

 public void addItem(T item) {
     items.add(item);
 }

 public T findItemById(int id) throws ItemNotFoundException 
 {
    for (T item : items)
    {
        if (item.getId()==id) 
        {
            return item;
        }
    }
    throw new ItemNotFoundException("Item with ID " + id + " not found.");
 }

 public void displayItems() 
 {
     for (T item : items) 
    {
         System.out.println(item.getItemDetailes());
    }
 }


 public void updateItem(int id, T newItem) throws ItemNotFoundException {
    for (int i = 0; i < items.size(); i++) {
        if (items.get(i).getId()==id) {
            items.set(i, newItem);
            return;
        }
    }
    throw new ItemNotFoundException("Item with ID " + id + " not found.");
}


public void deleteItem(int id) throws ItemNotFoundException {
    LibraryItem item = findItemById(id);
    items.remove(item);
}


} /////// end of class

