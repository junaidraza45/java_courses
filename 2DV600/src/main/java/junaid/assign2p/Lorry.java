package junaid.assign2p;


public class Lorry extends Vehicle {


        public Lorry() {
            super();
        }

        public Lorry(Passenger p) {
            super(p);
        }

        public int getMaxPassengers() {
            return 2;
        }

        public int getSpace() {
            return 5 * 8;
        }

        public int getPrice() {
            return 300 + 15 * getPassengerCount();
        }

        public String getName() {
            return "Car";
        }
    }
