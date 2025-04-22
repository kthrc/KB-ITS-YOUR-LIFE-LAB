package ch05.sec06;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        // 선언 및 생성 (초기화 X)
        int[] arr1 = new int[3];
        String[] arr2 = new String[3];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
            System.out.println(arr1[i]);
        }
        System.out.println();

        arr2[0] = "1월";
        arr2[1] = "2월";
        arr2[2] = "3월";

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
