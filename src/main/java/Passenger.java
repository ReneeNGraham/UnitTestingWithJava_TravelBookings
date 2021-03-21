public class Passenger {

    private String name;
    private int bag;


    public Passenger(String name, int bag) {
        this.name = name;
        this.bag = bag;

    }

    public String getName() {
        return name;
    }

    public int getBag() {
        return bag;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBag(int bag) {
        this.bag = bag;
    }
}
