package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 101;
        
        // 예외 처리
        if(score < 0 || score > 100) {
            System.out.println("올바르지 않은 점수입니다. 다시 입력하세요");
        // 종료
            return;
        }
        
        if (score >= 90) {
            System.out.println("점수가 90~100입니다.");
            System.out.println("등급은 A입니다.");
        } else if(score >= 80) {
            System.out.println("점수가 80~89입니다.");
            System.out.println("등급은 B입니다.");
        } else if(score >= 70) {
            System.out.println("점수가 70~79입니다.");
            System.out.println("등급은 C입니다.");
        } else {
            System.out.println("점수가 0~69입니다.");
            System.out.println("등급은 D입니다.");
        }
    }
}
