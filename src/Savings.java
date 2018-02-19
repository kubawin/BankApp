public class Savings extends Account {

    //list properties specific to savings acc
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;


    //constructor to initialize saving acc prop
    public Savings(String name, String ssN, double deposit) {
        super(name, ssN, deposit);
        this.accountNumber = "1" + accountNumber;
        setSafetyDepositBox();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }
    //list any methods specific to savings acc

    public void showInfo() {
        super.showInfo();
        System.out.println("Your saving account features:" +
                "\nSafety deposit box id: " + safetyDepositBoxID +
                "\nSafety deposit box key: " + safetyDepositBoxKey +
                "\nRate " + rate
        );
    }
}
