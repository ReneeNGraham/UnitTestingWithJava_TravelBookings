public enum PlaneType {

    BOEING_747(378, 660),
    AIRBUS_A380(575, 850),
    BOEING_777X9(352,550),
    AIRBUS_A340600(380, 440),
    AIRBUS_BELUGA_XL(155, 200);


    public final int weight;
    public final int capacity;

    PlaneType(int weight, int capacity) {
        this.weight = weight;
        this.capacity = capacity;
    }

    public int getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }

}
