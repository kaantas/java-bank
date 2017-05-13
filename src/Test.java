
public class Test {
    public static void main(String[] args) {
        BankAccount bankAccount = BankAccount.getInstance("Kaan Taş", 100);
        
        bankAccount.withdraw(25);
        bankAccount.withdraw(30);
        bankAccount.credit(25);
    }
}
