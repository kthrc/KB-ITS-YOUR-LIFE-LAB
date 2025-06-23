package ch18.sec11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample2 {
    public static void main(String[] args) throws Exception {
        File dir = new File("C:/Temp");

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("C:/Temp 디렉토리가 존재하지 않습니다.");
            return;
        }

        File[] files = dir.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd a HH:mm");

        for (File file : files) {
            // 1. 수정 날짜 출력
            String dateStr = sdf.format(new Date(file.lastModified()));
            System.out.printf("%-20s", dateStr);

            // 2. 디렉토리인지 파일인지 판단
            if (file.isDirectory()) {
                System.out.printf("%-10s%s\n", "<DIR>", file.getName());
            } else {
                System.out.printf("%-10d%s\n", file.length(), file.getName());
            }
        }
    }
}