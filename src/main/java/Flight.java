import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Flight {
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private Date departureTime;
    private SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
    private Plane plane;
    private ArrayList<Passenger> passengers;

    public Flight(String flightNumber, String destination, String departureAirport, String departureTime, Plane plane) throws ParseException {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = formatter.parse(departureTime);
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        return formatter.format(departureTime);
    }

    public Plane getPlane() {
        return plane;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void addPassenger(Passenger passenger) {
        if(this.plane.getPlaneType().capacity > passengerCount()){
            this.passengers.add(passenger);
        }
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public int availableSeatsCount() {
        return plane.getPlaneType().capacity - passengerCount();
    }

    public int bagWeightCount() {
        int bagWeight = 0;
        for (Passenger passanger:passengers) {
            bagWeight += passanger.getBagNumber();
        }
        return bagWeight;
    }
}
