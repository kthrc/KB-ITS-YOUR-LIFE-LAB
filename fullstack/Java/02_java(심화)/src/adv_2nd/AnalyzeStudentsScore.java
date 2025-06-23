package adv_2nd;

import java.util.Scanner;

public class AnalyzeStudentsScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
        int num = -1;
        int stuNum = 0;
        int[] scores = null;
        int sum = 0;
        int max = -1;
        while (num != 5) {
            System.out.println("------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");
            num = scanner.nextInt();

            if(num == 1) {
                System.out.print("학생수>");
                stuNum = scanner.nextInt();
                scores = new int[stuNum];  // 배열 크기 설정
                System.out.println();
            } else if (num == 2) {
                for(int i = 0; i < stuNum; i++) {
                    System.out.print("scores[" + i + "]>");
                    scores[i] = scanner.nextInt();
                    sum += scores[i];
                    max = Math.max(max, scores[i]);
                }
            } else if (num == 3) {
                for(int i = 0; i < stuNum; i++) {
                    System.out.println("scores[" + i + "]:" + scores[i]);
                }
            } else if (num == 4) {
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + (double)sum/stuNum);
            }

        }
        System.out.println();
        System.out.println("프로그램 종료");

    }
}
