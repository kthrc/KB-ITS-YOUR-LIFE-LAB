package ch06.sec08.exam03;

public class Car {
    int gas;

    // 리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
    void setGas(int gas) {
        this.gas = gas;
    }

    // 리턴 값이 boolean인 메소드로 gas 필드값이 0이면 false를, 0이 아니면 true를 리턴
    // 리턴하기 전 조건에 따라 "gas 가 있습니다" 또는 "gas 가 없습니다" 출력
    boolean isLeftGas() {
        if (gas != 0) {
            System.out.println("gas가 있습니다");
            return true;
        } else {
            System.out.println("gas가 없습니다");
            return false;
        }
    }
    // 무한루프를 돌면서 루프를 한 번 돌 때마다 gas의 값 1 감소
    // 주행이 가능한 상태라면 "달립니다. (gas잔량: xxx)" 출력
    // 주행할 수 없는 상태라면 "멈춥니다. (gas잔량: xxx)" 출력 후 메소드 종료
    void run() {
        while(true) {
            if(gas > 0) {
                System.out.println("달립니다. (gas잔량: " + gas + ")");
                gas--;
            }
            else{
                System.out.println("멈춥니다. (gas잔량: " + gas + ")");
                return;
            }
        }
    }
}
