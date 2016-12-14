import java.util.Scanner;
public class hw234 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double pop;
        double popGrowthRate;
        double estimatedPop;
        double annualIncrease;
        
        System.out.print("Enter current world pupulation: ");
        pop = input.nextLong();
        System.out.print("Enter current population growth rate: ");
        popGrowthRate = input.nextDouble();
        annualIncrease = pop * (popGrowthRate/ 100);
        
        System.out.printf("%nThe world population after one year: %f", (pop + annualIncrease));
        System.out.printf("%nThe world population after two year: %f", (pop + (annualIncrease*2)));
        System.out.printf("%nThe world population after three year: %f", (pop + (annualIncrease*3)));
        System.out.printf("%nThe world population after four year: %f", (pop + (annualIncrease*4)));
        System.out.printf("%nThe world population after five year: %f", (pop + (annualIncrease*5)));
                
    }
    
}
