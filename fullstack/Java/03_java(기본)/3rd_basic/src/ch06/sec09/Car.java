package ch06.sec09;

public class Car {
    // 필드 선언
    String model;
    int speed;

    // model 필드는 생성자로 초기화
    Car(String model) {
        this.model = model;
    }

    // speed 필드의 getter/setter 메소드 정의
    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        this.setSpeed(100);
        System.out.println(this.model + "가 달립니다.(시속: " + this.speed + "km/h)");
    }
}
