package ch13.sec02.exam01;

public class Product<K, M> {
    // 멤버 변수 kind, model을 제너릭으로 운영
    private K kind;
    private M model;

    // kind에 대한 getter, setter
    public K getKind() {
        return this.kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    // model에 대한 getter, setter
    public M getModel() {
        return this.model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
