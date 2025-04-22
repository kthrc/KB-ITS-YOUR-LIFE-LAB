package adv_2nd;

import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
        int num = -1; // 시작을 위한 -1
        int total = 0;
        while (num != 4) {
            System.out.println("------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");
            num = scanner.nextInt();
            
            if(num == 1) {
                System.out.print("예금액>");
                int plus = scanner.nextInt();
                total += plus;
            } else if (num == 2) {
                System.out.print("출금액>");
                int minus = scanner.nextInt();
                total -= minus;
            } else if (num == 3) {
                System.out.println("잔고>" + total);
            } 
            
        }
        System.out.println();
        System.out.println("프로그램 종료");
    }
}
