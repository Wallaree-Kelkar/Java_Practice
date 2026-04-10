abstract class Transport {
    int trackingId;
    String destination;
    abstract void disptach();
    abstract void getCoordinates();
    abstract void selfNavigate();
}

interface GPS {
    
}

interface Autonomous {

}

public class SmartLog {
    
}
