import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Flight {
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private Date departureTime;
    private SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
    private Plane plane;
    private ArrayList<Passenger> passengers;
    private ArrayList<Integer> seatsTaken;
    private Random rand = new Random();

    public Flight(String flightNumber, String destination, String departureAirport, String departureTime, Plane plane) throws ParseException {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = formatter.parse(departureTime);
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();
        this.seatsTaken = new ArrayList<Integer>();
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

    public ArrayList<Integer> getSeatsTaken() {
        return seatsTaken;
    }

    public void addPassenger(Passenger passenger) {
        if (this.plane.getPlaneType().capacity > passengerCount()) {
            assignSeat(passenger);
            this.passengers.add(passenger);
        }
    }

    public void assignSeat(Passenger passenger) {
        int int_random = rand.nextInt(this.plane.getPlaneType().capacity);
        // Avoid getting seat 0
        int_random++;
        if (seatsTaken.contains(int_random)) {
            // Use recursion if the seat already exists to avoid getting doubles and get another random number
            assignSeat(passenger);
        } else {
            seatsTaken.add(int_random);
            passenger.setSeatNumber(int_random);
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
        for (Passenger passanger : passengers) {
            bagWeight += passanger.getBagNumber();
        }
        return bagWeight;
    }

    // Bubble Sort and Binary Search never completed, sticking with random seat allocation

    // Bubble sort code based on this site, https://www.geeksforgeeks.org/java-program-for-bubble-sort/
    // Need to resolve this later
    public void bubbleSortSeats() {
//        Integer[] seats = new Integer[seatsTaken.size()];
//        seats = seatsTaken.toArray(seats);
//        int n = seats.length;
//        for (int i = 0; i < n-1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (seats[j] > seats[j++]) {
//                    // swap temp and our array
//                    int temp = seats[j];
//                    seats[j] = seats[j++];
//                    seats[j++] = temp;
//                }
//            }
//
//        }
//        seatsTaken = new ArrayList<Integer>(Arrays.asList(seats));
        Collections.sort(seatsTaken);
    }


    public boolean binarySeatSearch(ArrayList<Integer> seatsTaken, int seatNumber) {
        if (seatsTaken.size() == 0) {
            // break out of loop if person never found
            return false;
        }

        int midIndex = 0;
        if (seatsTaken.size() > 1) {
            midIndex = (int) Math.ceil((double) seatsTaken.size() / 2);
        }

        int midPoint = seatsTaken.get(midIndex);

        if (seatNumber == midPoint) {
            return true;
        }

        ArrayList<Integer> newSearchArea;

        if (seatNumber < midPoint) {
            newSearchArea = new ArrayList<Integer>(seatsTaken.subList(0, midIndex));
        } else {
            newSearchArea = new ArrayList<Integer>(seatsTaken.subList(midIndex + 1, seatsTaken.size()));
        }

        // using recursion
        return binarySeatSearch(newSearchArea, seatNumber);
    }

}
