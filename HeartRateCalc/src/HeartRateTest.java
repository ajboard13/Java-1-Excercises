import java.util.Scanner;
public class HeartRateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        HeartRates indiv = new HeartRates ( "", "", 0, 0, 0);
        
        String firstName;
        String lastName;
        int birthDay;
        int birthMonth;
        int birthYear;
        int age;
        int maxHR;
        double targetLow;
        double targetHigh;
        
        System.out.print("Enter your first name: ");
        firstName = input.nextLine();
        indiv.setFirstName(firstName);
        System.out.print("Enter your last name: ");
        lastName = input.nextLine();
        indiv.setLastName(lastName);
        
        System.out.print("Enter your birthdate:\nDay: ");
        birthDay = input.nextInt();
        indiv.setBirthDay(birthDay);
        System.out.print("Month(in integer form): ");
        birthMonth = input.nextInt();
        indiv.setBirthMonth(birthMonth);
        System.out.print("Year: ");
        birthYear = input.nextInt();
        indiv.setBirthYear(birthYear);
        
        age = indiv.calcAge();
        maxHR = indiv.calcMaxHR();
        targetLow = indiv.calcTargetLow();
        targetHigh = indiv.calcTargetHigh();
                
        
        System.out.printf("\nName: %s %s\nAge: %d\nMax HR: %d\nTarget HR is between %.0f and %.0f\n", 
                firstName, lastName, age, maxHR, targetLow, targetHigh);
        
        
         
                
        }
    
}
