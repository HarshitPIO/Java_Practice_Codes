package abhyas.dayX.Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
   static int count = 0;
private static ArrayList<Item> inventory = new ArrayList<>();
private static Scanner scanner = new Scanner(System.in);
    public static void addItem(String name, int quantity, int price) {
        Item newItem = new Item();
        newItem.setName(name);
        newItem.setQuantity(quantity);
        newItem.setPrice(price);
        count++;
        newItem.ID = count;
        inventory.add(newItem);
        System.out.println("Item added successfully");
    }
    public static void removeItem(int ID) {
        for(Item item : inventory) {
            if(item.ID == ID) {
                inventory.remove(item);
                System.out.println("Item removed");
                count--;
                break;
            }
            else System.out.println("Item not found");
        }
    }
    public static void updateItem(int ID, int quantity, int price) {
        for(Item item : inventory) {
            if(item.ID == ID) {
                item.setQuantity(quantity);
                item.setPrice(price);
                System.out.println("Item updated");
                break;
            }
            else System.out.println("Invalid ID");
        }
    }
    public static void viewItem() {
        if(count ==0) System.out.println("No items are present");
        else {
            for(Item item : inventory) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose any option: ");
            System.out.println("1. Add item");
            System.out.println("2. Update Item");
            System.out.println("3. Remove item");
            System.out.println("4. View items");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1: {
                    System.out.println("enter name of item");
                    scanner.skip("\\R?");
                    String name = scanner.nextLine();
                    System.out.println("Enter quantity of item");
                    int quantity = scanner.nextInt();
                    System.out.println("Enter price of item");
                    int price = scanner.nextInt();
                    addItem(name,quantity,price);
                    break;
                }
                case 2: {
                    System.out.println("enter item ID");
                    int ID = scanner.nextInt();
                    if(ID>count) {
                        System.out.println("Item does not exist");
                        break;
                    }
                    System.out.println("Enter updated quantity");
                    int quantity = scanner.nextInt();
                    System.out.println("enter updated price");
                    int price = scanner.nextInt();
                    updateItem(ID,quantity,price);
                    break;
                }
                case 3: {
                    System.out.println("Enter item ID to remove");
                    int ID = scanner.nextInt();
                    if(ID>count) {
                        System.out.println("Item does not exist");
                        break;
                    }
                    removeItem(ID);
                }
                case 4: {
                    viewItem();
                    break;
                }
                case 5: {
                    System.out.println("Exiting... ");
                    System.exit(0);
                }
                default:
                    System.out.println("Invalid choice ");
            }
        }
    }

}
