public class BankAccountApp {
    public static void main(String[] args) {

        Checking cacc1 = new Checking("Tom Wilson", "123456789", 1500);
        Savings sacc1 = new Savings("Rich Lowe", "123456789", 1230);

        cacc1.showInfo();
        sacc1.showInfo();
        //read a csv file and create new account based on that data


    }
}
