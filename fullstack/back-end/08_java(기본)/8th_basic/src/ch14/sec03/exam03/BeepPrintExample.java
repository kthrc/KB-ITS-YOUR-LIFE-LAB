package ch14.sec03.exam03;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        // Thread 클래스의 상속을 이용해서 작업 스레드에서 실행
        // 익명 객체
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();

                for(int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        // 1초 : 1000
                        Thread.sleep(500);
                    } catch (Exception e) {}
                }
            }
        };
        thread.start();

        for(int i = 0; i < 5; i++) {
            System.out.println("띵");

            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}
