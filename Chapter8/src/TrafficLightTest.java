
public class TrafficLightTest {
    public static void main(String[] args) {
        for(TrafficLight trafficlight: TrafficLight.values())
            System.out.printf("%s = %d\n", trafficlight, trafficlight.getDuration());
    }
    
}
