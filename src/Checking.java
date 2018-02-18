public class Checking extends Account {


    //list properties specific to checking acc
    int debitCardNumber;
    int debitCardPIN;


    //constructor to initialize checking acc prop

    public Checking(String name, String ssN, double deposit) {
        super(name, ssN, deposit);
        this.accountNumber = "2"+accountNumber;


    }

    //list any methods specific to checking acc
    public void showInfo() {
        System.out.println("Account type is checking");
        super.showInfo();
    }


}
