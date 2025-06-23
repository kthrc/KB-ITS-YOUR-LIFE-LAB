package ch11.sec06;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        // 10000원 예금
        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());
        try {
            // 5000원 인출
            account.withdraw(5000);
            

            // 7000원 인출
            account.withdraw(7000);
            

        } catch (InsufficientException e) {
            System.out.println(e.getMessage());
        }
    }
}
