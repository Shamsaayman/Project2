public class Subscriber extends Passenger{
    public Subscriber(String name, String ID) {
        super(name, ID);
    }


    @Override
    public void computeTripCost() {
        tripCost = reservedCar.route.price / 2;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + ID +
                ", Car Code: " + reservedCar.code +
                ", Route Price: " + reservedCar.route.price +
                ", Trip Cost: " + tripCost);
    }
}
