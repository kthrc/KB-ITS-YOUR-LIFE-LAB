package ch02.sec12;

public class PrintfExample {
    public static void main(String[] args) {
//        %d 같은 걸 출력하는 경우 println 안 쓰고 printf 사용
        int value = 123;
        System.out.printf("상품의 가격: %d원\n",value);
        System.out.printf("상품의 가격: %6d원\n",value);
        System.out.printf("상품의 가격: %-6d원\n",value);
        System.out.printf("상품의 가격: %06d원\n",value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n",10, area);

        String name = "홍길동";
        String job = "도적";

        System.out.printf("%d | %-6s | %6s", 1, name, job);
    }
}
