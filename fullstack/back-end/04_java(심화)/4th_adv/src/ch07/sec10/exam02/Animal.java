package ch07.sec10.exam02;

public abstract class Animal {
    public void breath() {
        System.out.println("숨을 쉽니다.");
    }

    // 추상 메소드 선언
    public abstract void sound();
}
