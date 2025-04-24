package ch14.sec03.exam02;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        // Runnable 인터페이스를 이용하여 작업 스레드에서 실행
        Thread thread = new Thread(new Runnable() {
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
        });

        thread.start();

        for(int i = 0; i < 5; i++) {
            System.out.println("띵");

            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}
