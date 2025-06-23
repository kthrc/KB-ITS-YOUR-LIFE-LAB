package adv_2nd;

public class ArrayLength {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        System.out.println(array.length); // {}의 개수 -> 3
        System.out.println(array[2].length); // 2번째 인덱스의 원소 개수 -> 5
    }
}
