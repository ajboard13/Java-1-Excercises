
public class ch513 {
    public static void main(String[] args) {
        int counter = 1;
        long factorial = 0L;
        do{
            if (counter == 1)
                factorial = counter * (counter + 1);
            else if (counter <= 20)
                factorial = factorial * counter;
            counter++;
                    
        }while (counter != 20);
        
        System.out.println("factorial of 20 is "+ factorial);
    }
    
}
