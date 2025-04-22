package adv_2nd;

public class ThreeMultiplesSum {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        int sum = 0;
        for(int i = start; i <= end; i++) {
            if(i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
