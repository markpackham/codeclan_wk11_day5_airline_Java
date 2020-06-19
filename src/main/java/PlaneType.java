public enum PlaneType {
    TINYPLANE(2,2),
    SMALLPLANE(3, 3),
    BIGPLANE(10, 10),
    HUGEPLANE(100, 100);

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
