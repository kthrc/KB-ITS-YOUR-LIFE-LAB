package ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        // 마지막 인덱스는 포함 안됨 (0-5)인덱스
        String firstNum = ssn.substring(0,6);
        System.out.println(firstNum);

        // 마지막 인덱스는 포함 안됨 (7-13)인덱스
        String secondNum = ssn.substring(7,14);
        System.out.println(secondNum);
    }
}
