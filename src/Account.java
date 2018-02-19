public abstract class Account implements IBaseRate {

    protected double rate;
    protected String accountNumber;
    //list common prop for savings and checking accounts
    private static int index = 10000;
    private String name;
    private String sSn;
    private double balance;

    //constructor to set base props and initialize account

    public Account(String name, String ssN, double deposit) {
        this.name = name;
        this.sSn = ssN;
        this.balance = deposit;

        // set account number
        ++index;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOfSSn = sSn.substring(sSn.length() - 2, sSn.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSn + uniqueID + randomNumber;
    }

    public void compound() {
        double accruedInterest = balance * (rate * 0.01);
        balance += accruedInterest;
        System.out.println("Accrued interest $" + accruedInterest);
        printBalance();
    }

    //list of common methods - transactions
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance -= amount;
        System.out.println("Transferring $" + amount + "to " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is $" + balance);
    }


    public void showInfo() {
        System.out.println(
                "Name: " + name
                        + "\nAccount Number: " + accountNumber
                        + "\nBalance: " + balance
        );
    }

}
