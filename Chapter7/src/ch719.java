import java.util.Scanner;

public class ch719{
    boolean[] arrSeats = new boolean[10];
    Scanner sc = new Scanner(System.in);

    public boolean assignSeat(String section){
        if(section == "first"){
            if(getFreeSeats(section) > 0){
                for(int i=0; i<5; i++){
                    if(arrSeats[i] == false){
                        arrSeats[i] = true;
                        printBoardingPass(i);
                        return true;
                    }
                }
            }
        }else if(section == "Second"){
            if(getFreeSeats(section) > 0){
                for(int i=5; i<arrSeats.length; i++){
                    if(arrSeats[i] == false){
                        arrSeats[i] = true;
                        printBoardingPass(i);
                        return true;
                    }
                }

            }
        }
        System.out.printf("All seats in section \"%s\" are booked.\n", section);
        System.out.printf("Would you like to be moved to section \"%s\" (y/n)? ",
                (section == "first") ? "Second" : "first");

        if(sc.next().charAt(0) == 'y')
            assignSeat((section == "first") ? "Second" : "first");
        else
            System.out.println("\nNext flight leaves in 3 hours.\n");

        return false;
    }

    private int getFreeSeats(String section){
        int total = 0;
        if(section == "first"){
            for(int i=0; i<5; i++){
                if(arrSeats[i] == false)
                    total += 1;
            }
        }else if(section == "Second"){
            for(int i=5; i<arrSeats.length; i++){
                if(arrSeats[i] == false)
                    total += 1;
            }
        }
        return total;
    }
    // see whether or not all seats are booked
    public boolean seatsAvailable(){
        // if empty seat found return true
        for(boolean seat : arrSeats)
            if(seat == false)
                return true;

        // if none found plane is full
        return false;
    }

    public void printGreeting(){
        System.out.println("\nWelcome to Aaron Airlines booking system.\n");
    }
    // print the menu with remaining number of seats for each section
    public void printMenu(){
        System.out.printf("1. Second class %s\n",
                (getFreeSeats("Second") > 0) ?
                "(" + Integer.toString(getFreeSeats("Second")) + ")" : "(full)");
        System.out.printf("2. First class %s\n",
                (getFreeSeats("first") > 0 ?
                 "(" + Integer.toString(getFreeSeats("first")) + ")" : "(full)"));
        System.out.print("Enter the section you would like: ");
    }
    // prints the boarding pass
    private void printBoardingPass(int seat){
        System.out.println("\nBoarding pass for Aaron Airlines.");
        System.out.printf("\nSECTION: %s\nSEAT NUMBER: %d\n\n\n",
                (seat < 5) ? "first" : "Second", seat + 1);
    }
}