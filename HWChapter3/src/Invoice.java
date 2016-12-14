public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityPurchased;
    private double itemPrice;
    
    public Invoice (String number, String description, int quantity, double price){
        partNumber = number;
        partDescription = description;
        quantityPurchased = quantity;
        itemPrice = price;
    }
    
    public void setPartNumber (String number){
        partNumber = number;
       
    }
    
    public String getPartNumber (){
        return partNumber;
    }
    
    public void setPartDescription (String description){
        partDescription = description;
    }
    public String getPartDescription(){
        return partDescription;
    }
    public void setQuantityPurchased (int quantity){
        quantityPurchased = quantity;
    }
    public int getQuantityPurchased (){
        return quantityPurchased;
       
    }
    public void setPrice (double price){
        itemPrice = price;
    }
    public double getPrice () {
        return itemPrice;
    }
    public double getInventoryAmount () {
        double calculateAmount;
        calculateAmount = quantityPurchased * itemPrice;
        return calculateAmount;
    }
    
}

