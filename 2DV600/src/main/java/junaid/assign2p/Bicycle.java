package junaid.assign2p;

public class Bicycle extends Vehicle {

    public Bicycle() {
        super();
    }

    public Bicycle(Passenger p) {
        super(p);
    }

    public int getMaxPassengers() {
        return 1;
    }

    public int getSpace() {
        return 1;
    }

    public int getPrice() {
        return 80;
    }

    public String getName() {
        return "Bicycle";
    }
}