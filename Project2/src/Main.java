//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Route r1 = new Route("Address1", "Address2", 50);
        Route r2 = new Route("Address3", "Address4", 100);
        Car car1 = new Car("Car1", r1, 4);
        Car car2 = new Car("Car2", r2, 0);
        Passenger[] p = {
                new Subscriber("Shamsa", "1"),
                new NonSubscriber("Noura", "2", true)
        };

        try {
            p[0].reserveCar(car1);
            p[1].reserveCar(car2);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        for (Passenger passenger : p) {
            passenger.displayInfo();
        }
    }
}