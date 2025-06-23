package ch06.sec08.exam02;

public class Computer {
    int sum(int ... values) { // 가변길이 파라미터 -> ... 변수명 이렇게!
        int rslt = 0;

        for(int i = 0; i < values.length; i++) {
            rslt += values[i];
        }

        return rslt;
    }
}
