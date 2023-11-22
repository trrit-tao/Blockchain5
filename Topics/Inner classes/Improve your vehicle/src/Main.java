class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    class Engine {

        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        public void printHorsePower() {
            System.out.println("Vehicle " + name + " has " + horsePower + " horsepower.");
        }

        void start() {
            System.out.println("RRRrrrrrrr....");
        }
    }
}


class EnjoyVehicle {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Dixi");
        Vehicle.Engine engine = vehicle.new Engine(15);
        engine.printHorsePower();
    }
}