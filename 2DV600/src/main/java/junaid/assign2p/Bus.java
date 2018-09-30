package junaid.assign2p;


public class Bus extends Vehicle {
    public Bus() {
        super();
    }

    public Bus(Passenger p) {
        super(p);
    }

    public int getMaxPassengers() {
        return 20;
    }

    public int getSpace() {
        return 5 * 4;
    }

    public int getPrice() {
        return 200 + 10 * getPassengerCount();
    }

    public String getName() {
        return "Car";
    }
}
