import java.util.Scanner;
public class ch517 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int product;
        int quantitySold;
        double productPrice;
        double value = 0.0;
        String item;
        String UserEnd = "";
        boolean cont = false;
        
        
        do {
        System.out.print("\nEnter the number of the product: ");
        product = input.nextInt();
        
        System.out.print("\nEnter the amount sold: ");
        quantitySold = input.nextInt();
        
        
        switch (product){
            case 1: 
                item = "Shampoo";
                productPrice = quantitySold * 2.98;
                value =value + productPrice;
                System.out.printf("\nItem 1: %s\nPrice: $2.29\nQuantity: %d\nTotal: $%.2f", item, quantitySold, productPrice);
                break;
            case 2:
                item = "Tooth Paste";
                productPrice = quantitySold * 4.5;
                value =value + productPrice;
                System.out.printf("\nItem 1: %s\nPrice: $4.50\nQuantity: %d\nTotal: $%.2f", item, quantitySold, productPrice);
                break;
            case 3:
                item = "Chicken";
                productPrice = quantitySold * 9.98;
                value =value + productPrice;
                System.out.printf("\nItem 1: %s\nPrice: $9.98\nQuantity: %d\nTotal: $%.2f", item, quantitySold, productPrice);
                break;
            case 4:
                item = "Milk";
                productPrice = quantitySold * 4.49;
                value =value + productPrice;
                System.out.printf("\nItem 1: %s\nPrice: $4.49\nQuantity: %d\nTotal: $%.2f", item, quantitySold, productPrice);
                break;
            case 5:
                item = "Steak";
                productPrice = quantitySold * 6.87;
                value =value + productPrice;
                System.out.printf("\nItem 1: %s\nPrice: $6.87\nQuantity: %d\nTotal: $%.2f", item, quantitySold, productPrice);
                break;
                
            default:
                System.out.println("\nInvalid product selection. Please try again.");
                }
            System.out.print("\nDo you wish to add more products? ");
            UserEnd = input.next();
            
            if (UserEnd.equals("no"))
                cont = true;
            else 
                cont = false;
        } while (cont != true);
        System.out.printf("\nThe total cost for this shopping trip is: $%.2f\n", value);
    }
    
}
