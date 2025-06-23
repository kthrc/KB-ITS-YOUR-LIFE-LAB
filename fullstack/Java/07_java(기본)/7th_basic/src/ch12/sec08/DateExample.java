package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date now = new Date();
//        System.out.println(now.toString()); // Wed Apr 23 15:40:42 KST 2025

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        System.out.println(sdf.format(now));
    }
}
