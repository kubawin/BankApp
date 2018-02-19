public class Checking extends Account {


    //list properties specific to checking acc
    private int debitCardNumber;
    private int debitCardPIN;


    //constructor to initialize checking acc prop

    public Checking(String name, String ssN, double deposit) {
        super(name, ssN, deposit);
        this.accountNumber = "2" + accountNumber;
        setDebitCard();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));

    }

    //list any methods specific to checking acc
    public void showInfo() {
        super.showInfo();
        System.out.println("Your checking account features:" +
                "\nDebit Card No: " + debitCardNumber +
                "\nDebit Card PIN: " + debitCardPIN +
                "\nRate " + rate
        );
    }


}
