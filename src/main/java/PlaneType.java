public enum PlaneType {
    TINYPLANE(2,5),
    SMALLPLANE(3, 8),
    BIGPLANE(10, 25),
    HUGEPLANE(100, 1000);

    public final int capacity;
    public final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
