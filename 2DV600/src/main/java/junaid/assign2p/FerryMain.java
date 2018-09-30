package junaid.assign2p;

import java.util.ArrayList;
import java.util.Iterator;

public class FerryMain implements Ferry {

    private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    private ArrayList<Passenger> passengers = new ArrayList<Passenger>();

    protected final int maxVehicleSpace = 50*5;
    protected final int maxSpacePassenger = 200;

    protected int moneycount = 0;

    protected int vehiclespace = 0;  //vehiclespace is set in terms of numbers of bicycles.
    protected int passengerCount = 0;

    private String name;

    public FerryMain(String ferryname) {
        this.name = ferryname;
    }

    @Override
    public int countPassengers() {
        return 0;
    }

    @Override
    public int countVehicleSpace() {
      return 0;
    }


    @Override
    public int countMoney(){ // returns the ferry's  money count
        return moneycount;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void embark(Vehicle v) {
        if (hasSpaceFor(v)) {
            vehicles.add(v);
            vehiclespace = vehiclespace+v.getSpace();
            passengerCount = passengerCount+v.getPassengerCount();

        } else
            throw new RuntimeException("no space");

    }

    @Override
    public void embark(Passenger p) {
        if (hasRoomForPassenger(p)) {
            passengers.add(p);
            passengerCount++;
        } else
            throw new RuntimeException("no room");
    }


    public void disembark(){  //disembark the ferry


        vehiclespace = 0;
        passengerCount = 0;


    }

    @Override
    public boolean hasSpaceFor(Vehicle v) {
        if(vehiclespace + v.getSpace() <= maxVehicleSpace  ){

            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean hasRoomForPassenger(Passenger p) {
        if(passengerCount  > maxSpacePassenger){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String args[]){
        Passenger bipassenger = new Passenger("Aslam");
        Bicycle bicycle = new Bicycle(bipassenger);

        System.out.println(bicycle);


        //get total price




    }

}

