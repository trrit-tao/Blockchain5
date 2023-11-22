class Vehicle {

    private static String name;

    public Vehicle(String name) {
        this.name = name;
    }

    // create constructor

    class Engine {

        void start() {
            System.out.println("RRRrrrrrrr....");
        }

    }

    public static class Body {
        String color;

        public Body(String color) {
            this.color = color;
        }

        public void printColor() {
            System.out.println("Vehicle " + name + " has " + color + " body.");
        }
    }
}

// this code should work
class EnjoyVehicle {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Dixi");
        Vehicle.Body body = new Vehicle.Body("red");
        body.printColor();
    }
}