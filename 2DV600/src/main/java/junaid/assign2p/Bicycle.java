package junaid.assign2p;

public class Bicycle extends Vehicle {

    Passenger passenger;

   /* public Bicycle() {
        super();
    }*/

    public Bicycle(Passenger passenger) {
        super(passenger);
        this.passenger = passenger;
    }

    public int getMaxPassengers() {
        return 1;
    }

    public int getSpace() {
        return 1;
    }

    public int getPrice() {
        return 50;
    }

    public String getName() {
        return "Bicycle";
    }

    @Override
    public String toString() {
        if(passenger != null){
         return  "Vehicle : "+getName()+" : Passenger Name :"+passenger.getName()+" : Price : "+getPrice();
        }else{
            return  "Vehicle : "+getName()+" Price : "+getPrice();
        }

    }
}