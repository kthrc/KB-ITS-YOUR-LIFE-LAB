package ch12.sec09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(sdf.format(now));

        // a: 오전/오후
        sdf = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss");
        System.out.println(sdf.format(now));

        // EE: 요일
        sdf = new SimpleDateFormat("오늘은 EE요일");
        System.out.println(sdf.format(now));

    }
}
