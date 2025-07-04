package ch16.sec04;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 실행문이 두 개 이상일 경우
        person.action((x, y) -> {
            return x + y;
        });

        // sum() 메소드를 호출
        person.action((x, y) -> sum(x, y));
    }
    public static double sum(double x, double y) {
        return (x+y);
    }
}
