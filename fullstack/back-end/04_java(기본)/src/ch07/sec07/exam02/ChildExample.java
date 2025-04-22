package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        parent.method1();
        parent.method2();
        child.method3();
//        parent.method3();
        // method3()은 자식(Child)에 있는 함수기 때문에, 부모(Parent)를 상속받은 자식(Child)에서 써준다.
    }
}
