import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Passenger> passengerList;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengerList = new ArrayList<Passenger>();
    }
}
