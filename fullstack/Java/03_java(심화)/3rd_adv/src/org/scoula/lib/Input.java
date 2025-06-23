package org.scoula.lib;

import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

    // String read(String title)
    // 매개변수 title을 출력하고 (줄바꿈하지 않음), 사용자가 입력한 문자열을 리턴함
    public static String read(String title){
        System.out.print(title);
        return sc.nextLine();
    }

    // String read(String title, String defaultValue)
    // 매개변수 title(defaultValue)를 출력하고(줄바꿈하지 않음), 사용자가 입력한 문자열을 리턴함

    public static String read(String title, String defaultValue){
        System.out.printf("%s(%s): ", title, defaultValue);
        String answer = sc.nextLine();

        // 그냥 엔터를 치면 defaultValue를 리턴, 입력값 있으면 answer 리턴
        return answer.isEmpty() ? defaultValue : answer;
    }

    // int readInt(String title)
    // 매개변수 title을 출력하고(줄바꿈하지 않음), 사용자가 입력한 문자열을 정수로 변환 후 리턴함
    public static int readInt(String title){
        System.out.print(title);
        int answer = sc.nextInt();
        sc.nextLine(); // 엔터 제거용
        return answer;
    }

    // boolean confirm(String title, boolean defaultValue)
    // 매개변수 title(Y/n)을 출력하고, (줄바꿈하지 않음)
    // defaultValue가 true이면 (Y/n), false이면 (y/N)을 출력
    // 입력 없이 엔터를 친 경우 기본값 리턴
    public static boolean confirm(String title, boolean defaultValue){
        String yesNo = defaultValue ? "(Y/n)" : "(y/N)";
        System.out.printf("%s %s: ", title, yesNo);

        String answer = sc.nextLine();
        if(answer.isEmpty())
            return defaultValue;
        return (answer.equalsIgnoreCase("y"));
    }
    // boolean confirm(String title)
    // 앞에서 정의한 confirm을 호출하여 그 결과 리턴
    public static boolean confirm(String title){
        return confirm(title, true);
    }
}
