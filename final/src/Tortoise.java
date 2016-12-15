import java.util.Random;

public class Tortoise{
    private int rand;
    private int move;

    public Tortoise() {
    }
    
    public int getMovementSpeed(){
        Random rand = new Random();
        int move;

        int  n = rand.nextInt((10-1) + 1) +1;
        this.rand=n;
        if(n <=5){
            move = 3;
        }else if (n>5 && n <=7){
            move = -6;
        }else if (n>7 && n <=10){
            move = 1;
        }else{
            move =0;
        }
        this.move=move;
        return move;
    }
}
