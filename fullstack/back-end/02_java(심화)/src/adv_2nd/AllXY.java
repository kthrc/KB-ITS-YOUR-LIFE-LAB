package adv_2nd;

public class AllXY {
    public static void main(String[] args) {
        // x, y는 10 이하의 자연수
        int x,y;
        // 60
        for(x = 1; x <= 10; x++) {
            for(y = 1; y <= 10; y++) {
                if( 4 * x + 5 * y == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                }

            }
        }
    }
}
