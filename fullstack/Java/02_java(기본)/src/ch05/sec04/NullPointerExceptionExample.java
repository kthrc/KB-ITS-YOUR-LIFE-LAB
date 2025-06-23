package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        //intArray는 지금 아무 배열도 가리키지 않음 -> 인덱스를 접근하려고 하니까 에러
//        int[] intArray = null;
//        intArray[0] = 10;

//        String str = null;
        // 값이 없어도 null 쓰면 error -> " " 이런 식으로 표기
        String str = " ";
        System.out.println("총 문자 수: " + str.length());
    }
}
