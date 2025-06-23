package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        // 업 캐스팅
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        // Parent는 부모 클래스이므로 field2 변수, method3 메소드를 가죄고 있지 않음!
//        parent.field2 = "data2";
//        parent.method3();
        // 강제 타입 변환
        // 다운캐스팅
        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3();
    }
}
