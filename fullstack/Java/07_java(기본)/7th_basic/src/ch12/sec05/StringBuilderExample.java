package ch12.sec05;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")
                .insert(0, "ABC") // offset: 주소
                .delete(3,4) // start, end
                .toString();
        System.out.println(data); // 결과: ABCEF
    }
}
