package ch13.sec03.exam01;

public class Box<T> {
    // 필드
    private T t;

    // Getter
    public T get() {
        return t;
    }

    // Setter
    public void set(T t) {
        this.t = t;
    }
}
