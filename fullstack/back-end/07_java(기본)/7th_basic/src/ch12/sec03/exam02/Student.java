package ch12.sec03.exam02;

public class Student {
    private int no;
    private String name;
    
    // 멤버 필드를 초기화하는 생성자
    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    // 멤버 필드에 대한 Getter/Setter 메소드
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
