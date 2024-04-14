public class Main {
    public static void main(String[] args) {
        Account a =new Account("a", 500);
        Account b = new Account("b", 300);
        Account c = new Account("c", 200);
        Account d = new Account("d", 300);
        Account e = new Account("e", 100);

        Account[] accounts = {a, b, c, d, e};

        Bank bank = new Bank(accounts);

        bank.monthlyPayment();
        bank.printAllAccounts();
        System.out.println(bank.getBankMoney());

        bank.transferMoney(a, b, 100);
        bank.printAllAccounts();
        bank.toBorrow(a, 100);
        bank.printAllAccounts();
    }
}