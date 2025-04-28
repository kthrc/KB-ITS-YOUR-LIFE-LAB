package ch14.exam;

public class MovieThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("동영상을 재생합니다.");
            try {
                Thread.sleep(1000); // 1초 동안 일시정지
            } catch (Exception e) {
                System.out.println("스레드가 중단되었습니다.");
            }
        }
    }

    public static void main(String[] args) {
        MovieThread movie = new MovieThread();
        movie.start(); // 스레드 시작
    }
}
