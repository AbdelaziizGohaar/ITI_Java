import Zezolib.Book;
import Zezolib.Client;
import Zezolib.ItemNotFoundException;
import Zezolib.Library;
import Zezolib.LibraryItem;
import Zezolib.Magazine;
import java.util.ArrayList;
import java.util.List;
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
        System.out.println("9. Exit");
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
        List<Client> clients = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

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
                        int removeId = scanner.nextInt();
                        scanner.nextLine();
                        library.deleteItem(removeId);
                        break;
                    case 5:
                        System.out.print("Enter Client ID: ");
                        int clientId = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Email: ");
                        String email = scanner.nextLine();
                        clients.add(new Client(clientId, name, email));
                        break;
                    case 6: /// retrieve client 
                        System.out.print("Enter Client ID: ");
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
                        if (clients.isEmpty()) {
                            System.out.println("No clients available.");
                        } else {
                            clients.forEach(c -> c.getClientDetails());
                        }
                        break;
                    case 8:
                        System.out.print("Enter Client ID to remove: ");
                        int removeClientId = scanner.nextInt();
                        scanner.nextLine();
                        Client clientToRemove = clients.stream()
                                .filter(c -> c.id == removeClientId)
                                .findFirst()
                                .orElseThrow(() -> new ItemNotFoundException("Client with ID " + removeClientId + " not found"));
                        clients.remove(clientToRemove);
                        System.out.println("Client with ID " + removeClientId + " removed successfully.");
                        break;
                    case 9:
                        System.out.println("Exiting the system. Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (ItemNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }


    }
}