import java.util.Scanner;
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("", "", 0, 0.0);
        
        Scanner input = new Scanner(System.in);
        
        String item;
        String description;
        int quantity;
        double price;
        
        System.out.print("Enter part number: ");
        item = input.nextLine();
        invoice.setPartNumber(item);
        
        System.out.print("Enter item description: ");
        description = input.nextLine();
        invoice.setPartDescription(description);
        
        System.out.print("Enter the quantity of the item purchased: ");
        quantity = input.nextInt();
        
        if (quantity > 0)
            invoice.setQuantityPurchased(quantity);
        
        System.out.print("Enter the price per item: ");
        price = input.nextDouble();
        
        if (price >0)
            invoice.setPrice(price);
        
        System.out.printf("The total amount for all items purchased = $%.2f%n", 
                invoice.getInventoryAmount());
        
    }
    
}
