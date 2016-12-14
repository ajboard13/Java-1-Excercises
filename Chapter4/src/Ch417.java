import java.util.Scanner;

public class Ch417 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int GasUsed;
        int milesDriven = 1;
        double tripMPG;
        int totalGas = 0;
        int totalMiles = 0;
        double totalMPG;
        int count = 1;
        
        while (milesDriven > 0){
            System.out.print("Enter the number of miles driven this trip: ");
            milesDriven = input.nextInt();
            System.out.print("Enter the number of gallons of gas used this trip: ");
            GasUsed = input.nextInt();
            totalGas = totalGas + GasUsed;
            totalMiles = totalMiles + milesDriven;
            tripMPG = milesDriven/GasUsed;
            totalMPG = totalMiles/totalGas;
            System.out.printf("\nTrip %d\n\nTrip MPG: %.2f\nTotal Miles: %d\nTotal MPG: %.2f",
                    count, tripMPG, totalMiles, totalMPG);
            ++count;
            System.out.println("\nDo you wish to add another trip? (1 for yes/0 for no) ");
            milesDriven = input.nextInt();
                   
                    
        }
        System.out.println("Goodbye");            
    }
    
}
