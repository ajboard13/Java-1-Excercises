import java.security.SecureRandom;

public class ch717{
    

    public static void main(String[] args){
        int[] die1 = new int[12];
        die1 = rollDie();
        System.out.printf("%s\t%10s", "Sum", "Frequency");
        
        for (int count = 0; count < die1.length; count++){
            if (count == 0)
                System.out.println("");
            else
                System.out.printf("\n%3d\t%10d", 1+count, die1[count]);
        }
        
        
        }
    public static int[] rollDie(){
        
        SecureRandom randomNumber = new SecureRandom();
        int[] frequency = new int[12];
        for (int roll = 1; roll <= 36000000; roll++)
            ++frequency[1+randomNumber.nextInt(11)];
        return frequency;
    }
}