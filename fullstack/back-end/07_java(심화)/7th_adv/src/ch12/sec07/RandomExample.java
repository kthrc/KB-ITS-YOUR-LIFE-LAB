package ch12.sec07;
import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        int[] myArr = new int[6];
        int[] selectedArr = new int[6];

        System.out.print("선택번호: ");
        Random rand = new Random(3);
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = rand.nextInt(45)+1;
            System.out.print(myArr[i] + " ");
        }
        System.out.println();

        System.out.print("당첨번호: ");
        rand = new Random(5);
        for (int i = 0; i < selectedArr.length; i++) {
            selectedArr[i] = rand.nextInt(45)+1;
            System.out.print(selectedArr[i] + " ");
        }
        System.out.println();

        Arrays.sort(myArr);
        Arrays.sort(selectedArr);

        boolean rslt = Arrays.equals(myArr, selectedArr);
        System.out.print("당첨여부: ");
        if(rslt) {
            System.out.println("1등에 당첨되셨습니다.");
        } else {
            System.out.println("당첨이 되지 않으셨습니다.");
        }
    }
}
