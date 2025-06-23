package ch04.sec04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        // 재사용성을 고려한 변수 선언
        int start = 1;
        int end = 100;
        
        int sum = 0;
        // 합을 위한 for 반복문
//        for (int i = start; i <= end; i++) {
//            sum += i;
//        }
        int i = start;
        while (i <= end) {
            sum += i;
            i++;
        }
        System.out.println(start + " ~ " + end + " 합 : " + sum);
    }
}
