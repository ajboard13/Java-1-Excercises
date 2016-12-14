import java.util.Scanner;

public class ch719test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ch719 ars = new ch719();
        String sect1ion = "Second";

        ars.printGreeting();

        while(ars.seatsAvailable()){
            ars.printMenu();
            int choice = sc.nextInt();
            String section;

            if(choice == 1 || choice == 2)
                section = (choice == 1) ? "Second" : "first";
            else
                continue;

            ars.assignSeat(section);
        }
        System.out.println("\tPLANE FULL\n");
    }
}