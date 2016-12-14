
public enum TrafficLight {
    RED(90),
    GREEN(70),
    YELLOW(60);
    
    private final int duration;

    private TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
    
    
}
