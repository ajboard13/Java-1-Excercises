import java.util.Scanner;
public class ch618 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side;
        
        System.out.println("enter the number of rows and columns you want:");
        side = input.nextInt();
        
        squareOfAsterisks(side);
        
    }
    public static void squareOfAsterisks (int n){
       for(int i = 0; i<n; i++){
           for(int l =0; l < n; l++)
               System.out.print("*");
           System.out.println();
       }
        
    }
}
