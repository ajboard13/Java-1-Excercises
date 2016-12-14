import java.util.Scanner;
public class ch511test {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int counter = 1, numbers = 0, smallint = 0, integer = 0;
    
    ch511 getSmall = new ch511(counter, numbers, integer, smallint);
    
    System.out.printf("How many integers do you wish to enter? ");
    numbers = input.nextInt();
    getSmall.setCLnumbers(numbers);
    
    System.out.printf("The Smallest number is: %d\n", getSmall.getSmallest());
    }    
}
