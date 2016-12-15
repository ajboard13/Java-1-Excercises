
public class RaceTest {
    public static void main(String[] args) {
        System.out.println("BANG!!\nAND THEY'RE OFF!");
        Track track = new Track();
        boolean raceover;

        track.createTrack();
        do{
        track.printTrack();
        track.setTrackPositions();
            System.out.println("");
        raceover=track.isRaceOver();
        }while(raceover !=true);
    }
}
