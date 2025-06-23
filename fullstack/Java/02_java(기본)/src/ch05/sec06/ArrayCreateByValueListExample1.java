package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] seasons = {"Spring", "Summer", "Fall", "Winter"};

        int[] scores = {83, 90, 87};

        for (int i = 0; i < seasons.length; i++) {
            System.out.println("season[" + i + "] : " +seasons[i]);
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + ((double)sum/(double)scores.length));
    }
}
