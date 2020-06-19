public class Passenger {
    private String name;
    private int bagNumber;

    public Passenger(String name, int bagNumber) {
        this.name = name;
        this.bagNumber = bagNumber;
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
}
