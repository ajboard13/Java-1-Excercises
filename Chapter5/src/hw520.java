import java.util.Scanner;
public class hw520 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n;
    double pi = 0;
    
        System.out.println("Enter the number of terms you wish to compute: ");
        n = input.nextInt();

    for(int counter = 1; counter < n; counter += 2) {

        pi = pi + ((1.0 / (2.0 * counter - 1)) - (1.0 / (2.0 * counter + 1)));

    }

    pi = pi * 4;
        System.out.printf("Pi = %f\n", pi);
    }
}
