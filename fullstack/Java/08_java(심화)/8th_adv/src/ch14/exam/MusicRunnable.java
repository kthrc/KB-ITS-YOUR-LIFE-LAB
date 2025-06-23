package ch14.exam;

public class MusicRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("음악을 재생합니다.");
            try {
                Thread.sleep(500); // 0.5초 동안 일시 정지 (500ms)
            } catch (Exception e) {
                System.out.println("스레드가 중단되었습니다.");
            }
        }
    }

    public static void main(String[] args) {
        // Runnable 구현체를 Thread에 넣어서 실행
        Thread musicThread = new Thread(new MusicRunnable());
        musicThread.start();
    }
}
