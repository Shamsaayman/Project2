abstract class Passenger {
    String name;
    String ID;
    Car reservedCar;
    int tripCost;

    public Passenger(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public int getTripCost() {
        return tripCost;
    }

    public void setTripCost(int tripCost) {
        this.tripCost = tripCost;
    }



    public void reserveCar(Car c) {
        if (c.maxCapacity == 0) {
            throw new RuntimeException("Cannot reserve a car with zero maximum capacity.");
        }

        reservedCar = c;
        computeTripCost();
    }

    public abstract void computeTripCost();

    public abstract void displayInfo();
}
