package junaid.assign2p;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    private static int nextId = 0;
    protected final int vehicleId;
    private List<Passenger> passengers;

    protected Vehicle() {
        vehicleId = nextId++;
        passengers = new ArrayList<Passenger>();
    }

    public Vehicle(Passenger p) {
        this();
        addPassenger(p);
    }

    public void addPassenger(Passenger p) {
        if (passengers.size() < getMaxPassengers()) {
            passengers.add(p);
        } else {
            throw new IllegalArgumentException("Too many passengers for " + getName());
        }
    }

    public int getPassengerCount() {
        return passengers.size();
    }

    public Passenger getPassenger(int i) {
        return passengers.get(i);
    }

    public abstract int getMaxPassengers();

    public abstract int getSpace(); // size is measured in bikes

    public abstract int getPrice();

    public abstract String getName();
}