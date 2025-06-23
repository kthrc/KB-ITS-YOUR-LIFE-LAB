package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수: " + result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        try {
            printLength("ThisIsJava");
            printLength(null);
            // 문제점 설명: null은 data가 없는 것이기 때문에,
            // data가 없는 경우의 예외처리를 해주지 않았다.
        } catch (Exception e) {
            // 예외 객체의 메시지로 출력
            System.out.println(e.getMessage());
            // 스택 추적 내용을 모두 출력
            System.out.println(e.getStackTrace());
        }
        System.out.println("[프로그램 종료]");
    }
}
