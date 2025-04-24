package ch11.sec06;

public class Account {
    private long balance;

    // 기본 생성자 선언
    public Account() {}

    // 잔액 조회
    public long getBalance() {
        return balance;
    }

    // 입금
    public void deposit(int money) {
        balance += money;
    }

    // 출금
    public void withdraw(int money) throws InsufficientException {
        if (balance < money) {
            // 인출 금액이 잔액보다 크면 InsufficientException 예외 발생
            throw new InsufficientException((money - balance) +" 모자람");
        } else {
            balance -= money;
        }
    }
}
