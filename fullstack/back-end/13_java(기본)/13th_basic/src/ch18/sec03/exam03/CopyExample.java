package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class CopyExample {
    public static void main(String[] args) {
        String originalFileName = "C:/Temp/test.jpg";
        String targetFileName = "C:/Temp/test2.jpg";

        try {
            // 입력 스트림 생성 (원본 파일 읽기)
            InputStream is = new FileInputStream(originalFileName);
            // 출력 스트림 생성 (복사할 파일 쓰기)
            OutputStream os = new FileOutputStream(targetFileName);

            byte[] buffer = new byte[1024]; // 1KB 버퍼
            int bytesRead;

            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }

            os.flush(); // 출력 버퍼 비우기
            os.close();
            is.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}