public class Passenger {
    private String name;
    private int bagNumber;
    private int seatNumber;
    private boolean flight;

    public Passenger(String name, int bagNumber) {
        this.name = name;
        this.bagNumber = bagNumber;
        this.seatNumber = 0;
        this.flight = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBagNumber() {
        return bagNumber;
    }

    public void setBagNumber(int bagNumber) {
        this.bagNumber = bagNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isFlight() {
        return flight;
    }

    public void setFlight(boolean flight) {
        this.flight = flight;
    }

}
