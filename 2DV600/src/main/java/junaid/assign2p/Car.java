package junaid.assign2p;

public class Car extends Vehicle {

    public Car() {
        super();
    }

    public Car(Passenger p) {
        super(p);
    }

    public int getMaxPassengers() {
        return 4;
    }

    public int getSpace() {
        return 5;
    }

    public int getPrice() {
        return 200 + 15 * getPassengerCount();
    }

    public String getName() {
        return "Car";
    }
}
