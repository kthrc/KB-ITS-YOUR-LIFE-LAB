package ch05.sec06;

public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] arr = new int[] {84, 90, 96};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("총합: " + sum);
        System.out.println("평균: " + (double)sum / (double)arr.length);
    }
}
