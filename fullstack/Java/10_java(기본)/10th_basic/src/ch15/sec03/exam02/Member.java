package ch15.sec03.exam02;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 자바에서 HashSet, HashMap 같은 자료구조는 객체를 비교하거나 중복 제거할 때
    // 기본적으로 주소(참조값)를 기준으로 비교함
    // 내용이 같을 때 같은 객체로 인식하길 원하면 equals()와 hashCode()를 재정의해야 함

    // hashCode 재정의
    // name과 age 값이 같으면 동일한 hashCode가 리턴됨
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    // name과 age 값이 같으면 true가 리턴됨
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member target) {
            return target.name.equals(name) && target.age == age;
        } else {
            return false;
        }
    }
}
