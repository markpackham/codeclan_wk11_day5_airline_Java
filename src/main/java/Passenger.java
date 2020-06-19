public class Passenger {
    private String name;
    private int bagNumber;
    private boolean flight;

    public Passenger(String name, int bagNumber) {
        this.name = name;
        this.bagNumber = bagNumber;
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

    public boolean isFlight() {
        return flight;
    }

    public void setFlight(boolean flight) {
        this.flight = flight;
    }


}
