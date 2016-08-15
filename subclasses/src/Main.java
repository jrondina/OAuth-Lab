/**
 * Created by jamesrondina on 6/28/16.
 */
public class Main {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("James");

        Car car1 = new Car("James", "240sx");

        Vehicle someVehicle = new Car("Prius", "Sally");

        ((Car)someVehicle).getWheels();
    }
}
