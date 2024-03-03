public class NonSubscriber extends Passenger{
    boolean discountCoupon;

    public NonSubscriber(String name, String ID, boolean discountCoupon) {
        super(name, ID);
        this.discountCoupon = discountCoupon;
    }

    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    @Override
    public void reserveCar(Car car) {
        if (car.maxCapacity == 0) {
            throw new RuntimeException("Cannot reserve a car with zero maximum capacity.");
        }

        reservedCar = car;
        computeTripCost();
    }

    @Override
    public void computeTripCost() {
        int routePrice = reservedCar.route.price;
        if (discountCoupon) {
            tripCost = (int) (routePrice * 0.9);
        } else {
            tripCost = routePrice;
        }
    }

    @Override
    public void displayInfo() {
        if (reservedCar != null) {
            System.out.println("Name: " + name + ", ID: " + ID +
                    ", Car Code: " + reservedCar.code +
                    ", Route Price: " + reservedCar.route.price +
                    ", Trip Cost: " + tripCost);
        } else {
            System.out.println("Name: " + name + ", ID: " + ID +
                    ", Car Code: -" +
                    ", Route Price: -" +
                    ", Trip Cost: - (Car not reserved)");
        }
    }
}
