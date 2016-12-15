
public class Track {
    private String[] track = new String[70];
    private int RabbitPosition;
    private int TortoisePosition;
    private boolean RaceOver = false;
    private Rabbit r = new Rabbit();
    private Tortoise t = new Tortoise();
    private int resetT;
    private int resetR;
    
    public void createTrack(){
        for(int t=0; t < this.track.length; t++){
         this.track[t]="-";
        }
    }
    
    public void setTrackPositions(){
        this.resetR = this.RabbitPosition;
        this.resetT = this.TortoisePosition;

        this.TortoisePosition += this.t.getMovementSpeed();
        this.RabbitPosition += this.r.getMovementSpeed();
        checkForOutofArray();
        checkForWinner();
        
        if (this.RabbitPosition <69 && this.TortoisePosition<69){
            if (this.RabbitPosition == this.TortoisePosition){
                this.track[this.RabbitPosition]="Ouch!";
            }else {
                this.track[this.RabbitPosition]="R";
                this.track[this.TortoisePosition]= "T";
            }
            resetOldPositions();
        }
    }
    
    private void resetOldPositions(){
        this.track[this.resetR]= "-";
        this.track[this.resetT]= "-";
    }
    public void printTrack(){
        if (this.RabbitPosition == this.TortoisePosition){
            for(int t=0; t < this.track.length-2; t++){
                System.out.print(this.track[t] + " ");
            }
        }else{
            for (String track1 : this.track) {
                System.out.print(track1 + " ");
            }
        }
    }
    
    private void checkForOutofArray(){
        if(this.RabbitPosition<0){
            this.RabbitPosition = 0;
        }
        if(this.TortoisePosition<0){
            this.TortoisePosition=0;
        }
    }
    private void checkForWinner(){
        if(this.RabbitPosition>=69){
            this.RabbitPosition = 69;
            declareWinner();
        }
        if(this.TortoisePosition>=69){
            this.TortoisePosition=69;
            declareWinner();
        }
        
    }
    private void declareWinner(){
        if(this.RabbitPosition == 69 && this.RabbitPosition > this.TortoisePosition){
            System.out.println("\nRabbit wins. Yuch.");
        }
        else if (this.TortoisePosition ==69 && this.TortoisePosition > this.RabbitPosition){
            System.out.println("\nTORTOISE WINS!!! YAY!!!");
        }else if(this.RabbitPosition==69 && this.TortoisePosition==69){
            System.out.println("\nIt's a tie!");
        }
        this.RaceOver = true;
    }

    public boolean isRaceOver() {
        return RaceOver;
    }
    
   
    
}
