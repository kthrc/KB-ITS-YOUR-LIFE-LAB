package ch04.sec03;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = 9;
        System.out.println("[현재시간: " + time + "시]");
        
        // break 문이 없어서 9시 이후로 다 출력됨
        switch (time) {
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:
                System.out.println("외근을 나갑니다.");
        }
    }
}
