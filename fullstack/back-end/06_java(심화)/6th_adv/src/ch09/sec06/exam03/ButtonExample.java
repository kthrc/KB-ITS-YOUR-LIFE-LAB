package ch09.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        // OK 버튼 객체 생성
        Button btnOk = new Button();

        // OK 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
        class OKListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }

        // OK 버튼 객체에 ClickListener 구현 객체 주입
        btnOk.setClickListener(new OKListener());

        // OK 버튼 클릭하기
        btnOk.click();
    }
}
