import java.util.Scanner;


public class ch511 {
    private int CLcounter, CLnumbers, CLinteger, CLsmallint;
    
    public ch511 (int counter, int numbers, int integer, int smallint){
        CLcounter = counter;
        CLnumbers = numbers;
        CLinteger = integer;
        CLsmallint = smallint;
    }

    public int getCLcounter() {
        return CLcounter;
    }

    public void setCLcounter(int counter) {
        this.CLcounter = counter;
    }

    public int getCLnumbers() {
        return CLnumbers;
    }

    public void setCLnumbers(int numbers) {
        this.CLnumbers = numbers;
    }

    public int getCLinteger() {
        return CLinteger;
    }

    public void setCLinteger(int integer) {
        this.CLinteger = integer;
    }

    public int getCLsmallint() {
        return CLsmallint;
    }

    public void setCLsmallint(int CLsmallint) {
        this.CLsmallint = CLsmallint;
    }


    public int getSmallest (){
    Scanner input = new Scanner(System.in);
    
    for (CLcounter = 1; CLcounter <= CLnumbers; CLcounter++){
        System.out.println("Enter integer: ");
        CLinteger = input.nextInt();
        
        if (CLcounter == 1)
            CLsmallint = CLinteger;
        else if (CLinteger < CLsmallint)
            CLsmallint = CLinteger;
            }
    return CLsmallint;
    }
}

