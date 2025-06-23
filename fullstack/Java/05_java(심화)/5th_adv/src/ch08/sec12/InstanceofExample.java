package ch08.sec12;

public class InstanceofExample {
    public static void ride(Vehicle vehicle){
        // vehicle객체가 bus 객체라면 승차요금 체크
        if (vehicle instanceof Bus) {
            // 다운캐스팅
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }

        vehicle.run();
    }
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
//        System.out.println();
        ride(bus);
    }
}
