package ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        MovieThread movieThread = new MovieThread();
        movieThread.start();

        // MusicRunnable은 Runnable 구현 -> Thread 생성자에 넣어줘야 함
        MusicRunnable musicRunnable = new MusicRunnable();
        Thread musicThread = new Thread(musicRunnable);
        musicThread.start();
    }
}
