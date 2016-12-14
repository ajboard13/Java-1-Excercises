import java.util.Scanner;
public class ch617 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean even;
        System.out.println("Enter an integer, enter a letter to exit");
        
        while (input.hasNextInt()){
            int n = input.nextInt();
        even = IsEven(n);
        }
        
    }
public static boolean IsEven (int n){
    boolean even;
    if (n%2 == 0){
        even = true;
        System.out.printf("%d is even\n", n);}
    
    else{
        even = false;
        System.out.printf("%d is not even\n", n);
    }
    return even;
}    
}
