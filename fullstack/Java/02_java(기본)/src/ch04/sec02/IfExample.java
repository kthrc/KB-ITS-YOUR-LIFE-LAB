package ch04.sec02;

public class IfExample {
    public static void main(String[] args) {
        int score = 93;
        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        if (score < 90)
            System.out.println("점수가 90보다 작습니다.");
        // {} 중괄호로 묶어주지 않아서 아래의 문장도 같이 출력되고 있다. (if문 아래의 문장까지만 인식)
            System.out.println("등급은 B입니다."); // if문과는 상관없는 실행문

    }
}
