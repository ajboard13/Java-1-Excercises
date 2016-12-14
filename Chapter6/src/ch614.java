import java.util.Scanner;
public class ch614 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = 0;
        int e = 0;
        
        System.out.println("Enter an integer: ");
        n = input.nextInt();
        
        while (e == 0){
        System.out.println("Enter a positive exponent: ");
        e = input.nextInt();
        
        if (e <= 0){
            System.out.println("Not a positive exponent!");
            e = 0;}
        }
        int prod = Prod(n, e);
        
        System.out.printf("\n%d to the power of %d is %d\n", n, e, prod);
    }    
        public static int Prod(int n, int e)
        {
            int count = 1;
            int prod = n;
            while (count < e){
                prod = prod * n;
                count++;
            }
            return prod;
        }
    
    
}
