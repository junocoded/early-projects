import java.util.Scanner;
public class MyClass {
    
    public static void printSummary(int id, int items, double price) {
        double totalPrice = items * price;
        // we are scanning for the amount of items being purchased. This assumes there is only one product for sale, at a set price of $13.45 each
        System.out.println("Order " + id + ":");
        System.out.println("Items: " + items);
        System.out.printf("Total: $%.2f\n", totalPrice);
    }


     public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        int id = 69; 
        int items = input.nextInt();
        double price = 13.45;

        printSummary(id, items, price);
    }
}