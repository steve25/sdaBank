public class Bank {
    private Account[] accounts;

    private double bankMoney = 1000;

    public void monthlyPayment() {
        for (Account account : accounts) {
            double fee = 5;
            account.withdraw(fee);
            bankMoney += fee;
        }
    }

    public void transferMoney(Account sender, Account receiver, double money) {
        if (money < 0 || sender.getBalance() < money) {
            System.out.println("Nemozes poslat peniaze.");
            return;
        }

        sender.withdraw(money);
        receiver.deposit(money);
        System.out.println("Peniaze odoslane.");
    }

    public void toBorrow(Account account, double money) {
        if (account.getBalance() > 200 && money < account.getBalance() * 5) {
            System.out.println("Banka ti pozicia peniaze.");
            bankMoney -= money;
            account.deposit(money);
        } else {
            System.out.println("Banka ti nepozicia");
        }
    }

    public void printAllAccounts() {
        for (Account account : accounts) {
            System.out.println(account.getName() + " - " + account.getBalance());
        }
    }

    public double getBankMoney() {
        return bankMoney;
    }

    public Bank(Account[] accounts) {
        this.accounts = accounts;
    }
}
