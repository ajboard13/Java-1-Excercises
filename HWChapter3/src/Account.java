
public class Account {

    private String name;
    private double balance;
    
    public Account(String name,double balance){
        this.name = name;
        
        if (balance > 0.0)
            this.balance = balance;
    }
    
    public void withdraw(double withdrawAmount){
        if (withdrawAmount < balance)
            balance = balance - withdrawAmount;
        else
            System.out.println("withdrawel amount exceeded account balance.");
    }
    
    public void deposit(double depositAmount){
        if (depositAmount < balance)
            balance = balance + depositAmount;
    }
    
    public double getBalance(){
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
