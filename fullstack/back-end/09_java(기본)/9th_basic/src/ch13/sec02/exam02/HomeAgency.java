package ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home>{
    @Override
    public Home rent() {
        // HomeAgency의 rent()는 Home 클래스 인스턴스를 리턴
        return new Home();
    }
}
