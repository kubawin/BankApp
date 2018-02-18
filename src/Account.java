public abstract class Account implements IBaseRate {

    //list common prop for savings and checking accounts
    String name;
    String sSn;
    double balance;

    double rate;
    String accountNumber;
    static int index = 10000;


    //constructor to set base props and initialize account

    public Account(String name,  String ssN, double deposit) {
        this.name = name;
        this.sSn = ssN;
        this.balance = deposit;

        // set account number
        ++index;
        this.accountNumber = setAccountNumber();


    }

    private String setAccountNumber() {
        String lastTwoOfSSn = sSn.substring(sSn.length()-2, sSn.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10,3));
        return lastTwoOfSSn + uniqueID + randomNumber;
    }
    //list of common methods
    public void showInfo() {
        System.out.println(
                "Name: " + name
                + "\nAccount Number: " + accountNumber
                + "\nBalance: " + balance
        );
    }

}
