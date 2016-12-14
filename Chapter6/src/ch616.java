import java.util.Scanner;
public class ch616 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line;
        
        System.out.println("Enter integers to test in pairs sperated by a space, enter a letter end the input:");
        
        while (input.hasNextLine()){
        line = input.nextLine();
        Scanner linescan = new Scanner(line);
        if (linescan.hasNextInt()){
        int x = linescan.nextInt();
        int y = linescan.nextInt();
        int test;
        test = y%x;
        if (test == 0)
                System.out.printf("%d is a multiple of %d\n", y, x);
        else
                System.out.printf("%d is not a multiple of %d\n", y, x);
        }
        else
            break;
        }
    }
    
}
