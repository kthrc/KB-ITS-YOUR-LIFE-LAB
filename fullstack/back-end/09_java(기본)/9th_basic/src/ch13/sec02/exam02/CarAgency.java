package ch13.sec02.exam02;

public class CarAgency implements Rentable<Car>{
    @Override
    public Car rent() {
        // CarAgency의 rent()는 Car 클래스 인스턴스를 리턴
        return new Car();
    }
}
