import java.util.ArrayList;

public class FlightManager {
    private Flight flight;
    private Passenger passenger;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public int reservedBaggageWeight(Flight flight){
        int baggageWeightLimit = flight.getPlane().getPlaneType().totalWeight/2;
        return baggageWeightLimit/flight.getPlane().getPlaneType().capacity;
    }


    public int passangersBaggageWeight(Flight flight) {
       ArrayList<Passenger> passengers = flight.getPassengers();
       int weight = 0;
        for (Passenger passenger:passengers) {
            weight += passenger.getBagNumber();
        }
        return weight;
    }
}
