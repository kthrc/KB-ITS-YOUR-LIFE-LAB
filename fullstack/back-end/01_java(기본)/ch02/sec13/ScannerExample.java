package ch02.sec13;

// import 문은 패키지 선언과 클래스 선언 사이에 작성
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("x값 입력: ");
//        int x = sc.nextInt();
//
//        System.out.print("y값 입력: ");
//        int y = sc.nextInt();
//
//        System.out.println("x + y: " + (x + y));
        Scanner scanner = new Scanner(System.in);
        String str = "";

        do {
            System.out.print("입력 문자열: ");
            str = scanner.next();
            if (!str.equals("q")) {
                System.out.println("출력 문자열: " + str);
            }
        } while(!str.equals("q"));

        System.out.println("종료");
    }

}
