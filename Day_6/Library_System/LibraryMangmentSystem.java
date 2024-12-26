import Zezolib.Book;
import Zezolib.Client;
import Zezolib.ItemNotFoundException;
import Zezolib.Library;
import Zezolib.LibraryItem;
import Zezolib.Magazine;
import java.util.Scanner;


public class LibraryMangmentSystem {

    public static void showMainMenue()
    {
        System.out.println("\n Library Management System");
        System.out.println("1. Add Library Item");
        System.out.println("2. Retrieve Library Item");
        System.out.println("3. Display All Library Items");
        System.out.println("4. Remove Library Item");
        System.out.println("5. Add Client");
        System.out.println("6. Retrieve Client Details");
        System.out.println("7. Display All Clients");
        System.out.println("8. Remove Client");
        System.out.println("9. Client Borrow Item");
        System.out.println("10. Client Return Item");
        System.out.println("11. Exit");
        System.out.print("Enter your choice: ");
    }

    public void drawMenu()
    {
    }

    public static void main(String[] args) 
    {
       // try{
       //     Runtime.getRuntime().exec(Arrays.asList("clear").toArray());
        //}catch(Exception e){}
        
         Library library = new Library();
       // List<Client> clients = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // enter 1 Client & 1 book to Testing 
        library.addItem(new Book(1, "Flowers Of War", "Gohaar"));
        library.ClientList.add(new Client(1, "Aziz", "Zezo@Gohar"));

        while (true) {
            showMainMenue();

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
           
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter item type (1 for Book, 2 for Magazine): ");
                        int itemType = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter ID: ");
                        if (!scanner.hasNextInt()) { // Check if the next input is an integer
                            throw new IllegalArgumentException("ID must be an integer!");
                        }
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Title: ");
                        String title = scanner.nextLine();
                        if (itemType == 1) {
                            System.out.print("Enter Author: ");
                            String author = scanner.nextLine();
                            library.addItem(new Book(id, title, author));
                        } else if (itemType == 2) {
                            System.out.print("Enter Issue: ");
                            String issue = scanner.nextLine();
                            library.addItem(new Magazine(id, title, issue));
                        } else {
                            System.out.println("Invalid item type.");
                        }
                        break;
                    case 2:
                        System.out.print("Enter item ID: ");
                        if (!scanner.hasNextInt()) { // Check if the next input is an integer
                            throw new IllegalArgumentException("ID must be an integer!");
                        }
                        int retrieveId = scanner.nextInt();
                        scanner.nextLine();
                        LibraryItem item = library.findItemById(retrieveId);
                        System.out.println("Item Details: " + item.getItemDetailes());
                        break;
                    case 3:
                        library.displayItems();
                        break;
                    case 4:
                        System.out.print("Enter item ID to remove: ");
                        if (!scanner.hasNextInt()) { // Check if the next input is an integer
                            throw new IllegalArgumentException("ID must be an integer!");
                        }
                        int removeId = scanner.nextInt();
                        scanner.nextLine();
                        library.deleteItem(removeId);
                        break;
                    case 5:
                        System.out.print("Enter Client ID: ");
                        if (!scanner.hasNextInt()) { // Check if the next input is an integer
                            throw new IllegalArgumentException("ID must be an integer!");
                        }
                        int clientId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Email: ");
                        String email = scanner.nextLine();
                        library.ClientList.add(new Client(clientId, name, email));
                        break;
                    case 6: /// retrieve client 
                        System.out.print("Enter Client ID: ");
                        if (!scanner.hasNextInt()) { // Check if the next input is an integer
                            throw new IllegalArgumentException("ID must be an integer!");
                        }
                        int retrieveClientId = scanner.nextInt();
                        scanner.nextLine();
                        Client SearchClient = library.findClientById(retrieveClientId);
                 
                      /*   Client client = clients.stream()
                                .filter(c -> c.getId() == retrieveClientId)
                                .findFirst()
                                .orElseThrow(() -> new ItemNotFoundException("Client with ID " + retrieveClientId + " not found"));
                             */
                                 SearchClient.getClientDetails();
                        break;
                    case 7:
                        if (library.ClientList.isEmpty()) {
                            System.out.println("No clients available.");
                        } else {
                            library.ClientList.forEach(c -> c.getClientDetails());
                        }
                        break;
                    case 8:
                        System.out.print("Enter Client ID to remove: ");
                        if (!scanner.hasNextInt()) { // Check if the next input is an integer
                            throw new IllegalArgumentException("ID must be an integer!");
                        }
                        int removeClientId = scanner.nextInt();
                        scanner.nextLine();
                        Client clientToRemove = library.ClientList.stream()
                                .filter(c -> c.id == removeClientId)
                                .findFirst()
                                .orElseThrow(() -> new ItemNotFoundException("Client with ID " + removeClientId + " not found"));
                                library.ClientList.remove(clientToRemove);
                        System.out.println("Client with ID " + removeClientId + " removed successfully.");
                        break;
                        case 9:
                      //  System.out.print("Enter Client ID to To Borrow : ");
                      //  int ClientIdtoBorrow = scanner.nextInt();
                      //  scanner.nextLine();
                      //  Client Clientobjborrow = library.findClientById(ClientIdtoBorrow);
                        //////////////////////////////////////////////////////////////
                     //   library.displayItems();
                      //  System.out.print("Enter item ID: ");
                      //  int ItemobjId = scanner.nextInt();
                       // scanner.nextLine();
                      //  LibraryItem itemobj = library.findItemById(ItemobjId);
                      //  Clientobjborrow.ClientBorrowList.add(itemobj);
                        /////////////////////////////////////////////////////////////////////////////////////////////
                        System.out.print("Enter Client ID to Borrow: ");
                        if (!scanner.hasNextInt()) { // Check if the next input is an integer
                            throw new IllegalArgumentException("ID must be an integer!");
                        }
                        int clientIdToBorrow = scanner.nextInt();
                        scanner.nextLine();                
                        Client clientObjBorrow = library.findClientById(clientIdToBorrow);                
                        library.displayItems();
                        System.out.print("Enter item ID: ");
                        int itemObjId = scanner.nextInt();
                        scanner.nextLine();
                
                        LibraryItem itemObj = library.findItemById(itemObjId);                
                        if(itemObj.Stock == false)
                        {
                            System.out.println("Cant Borrow Item!");
                        }else
                        {
                            clientObjBorrow.addBorrowedItem(itemObj);
                            /// Set item Flag to borrowed   
                            itemObj.Stock = false;
                            System.out.println("Item borrowed successfully!");
                        }
                        
                        break;
                        case 10:
                        // new Feature 
                        System.out.print("Enter Client ID to Return : ");
                        if (!scanner.hasNextInt()) { // Check if the next input is an integer
                            throw new IllegalArgumentException("ID must be an integer!");
                        }
                        int clientIdToReturn = scanner.nextInt();
                        scanner.nextLine();                
                        Client clientObjReturn = library.findClientById(clientIdToReturn);                
                        clientObjReturn.displayBorrowedItems();
                        System.out.print("Enter item id to return : ");
                        int objIdToReturn = scanner.nextInt();
                        scanner.nextLine();
                        clientObjReturn.returnItem (objIdToReturn);              
                        System.out.println("Item returned successfully! ");

                        break;
                    case 11:
                        System.out.println("Exiting the system. Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (ItemNotFoundException e) {
                System.out.println(e.getMessage());
            }catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); 
            }
             catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }


    }
}