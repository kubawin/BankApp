public class Savings extends Account {

    //list properties specific to savings acc
    int safetyDepositBoxID;
    int safetyDepositBoxKey;


    //constructor to initialize saving acc prop
    public Savings(String name, String ssN, double deposit) {
        super(name, ssN, deposit);
        this.accountNumber = "1"+accountNumber;
        setSafetyDepositBox();

    }
    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
    }
    //list any methods specific to savings acc

    public void showInfo() {
        System.out.println("Account type is savings");
        super.showInfo();
        System.out.println("Your saving account features" +
        "\nSafety deposit box id is: " + safetyDepositBoxID +
        "\nSafety deposit box key is: " + safetyDepositBoxKey);
    }
}
