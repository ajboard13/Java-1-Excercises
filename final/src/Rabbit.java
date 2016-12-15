import java.util.Random;

public class Rabbit{
    private int rand;
    private int move;

    public Rabbit() {
    }
    
    
    public int getMovementSpeed(){
        Random rand = new Random();
        int move;

        int  n = rand.nextInt((10-1) + 1) +1;
        this.rand = n;
        if(n <=2){
            move = 0;
        }else if (n>2 && n <=4){
            move = 9;
        }else if (n>4 && n <=5){
            move = -12;
        }else if (n>5 && n <=8){
            move = 1;
        }else if (n>8 && n <=10){
            move = -2;
        }else{
            move =0;
        }
        this.move = move;
        return move;
    }
}
