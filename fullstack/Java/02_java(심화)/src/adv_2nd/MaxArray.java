package adv_2nd;

public class MaxArray {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println("최댓값: " + max);

    }
}
