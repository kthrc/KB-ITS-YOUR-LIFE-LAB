package adv_2nd;

public class AllSumAvg {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        int cnt = 0;
        // 중첩 for문
        for(int i =0; i < array.length; i++) {
            for(int j=0; j < array[i].length; j++) {
                sum += array[i][j];
                cnt++;
            }
        }
        System.out.println("전체 합: "+sum);
        System.out.println("전체 평균: " + (double)sum/(double)cnt);
    }
}
