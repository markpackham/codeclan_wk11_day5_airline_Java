public class FlightManager {
    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public int passangerBaggageWeight(Flight flight){
        int baggageWeightLimit = flight.getPlane().getPlaneType().totalWeight/2;
        return baggageWeightLimit/flight.getPlane().getPlaneType().capacity;
    }


}
