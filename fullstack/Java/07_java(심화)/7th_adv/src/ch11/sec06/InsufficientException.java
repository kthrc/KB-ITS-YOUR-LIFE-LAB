package ch11.sec06;

public class InsufficientException extends Exception {
    // 기본 생성자 선언
    public InsufficientException() {}

    // 생성자
    public InsufficientException(String message) {
        super(message);
    }
}
