package ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        // 구구단을 위한 이중 for문
        for(int i = 2; i <= 9; i++) {
            System.out.println("*** " + i + "단 ***");
            for(int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
