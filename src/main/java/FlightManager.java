import java.util.ArrayList;

public class FlightManager {
    private Flight flight;
    private Passenger passenger;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public double reservedBaggageWeight(Flight flight){
        double baggageWeightLimit = flight.getPlane().getPlaneType().totalWeight/2;
        return baggageWeightLimit/flight.getPlane().getPlaneType().capacity;
    }

    public double passangersBaggageWeight(Flight flight) {
       ArrayList<Passenger> passengers = flight.getPassengers();
       double weight = 0;
        for (Passenger passenger:passengers) {
            weight += passenger.getBagNumber();
        }
        return weight;
    }

    public double remainingReservedWeight(Flight flight) {
        return reservedBaggageWeight(flight) - passangersBaggageWeight(flight);
    }
}
