import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {

        List<Account> accounts = new LinkedList <Account>();



        //read a csv file and create new account based on that data
        String file = "E:\\podyp_java\\BankApp\\src\\utilities\\NewBankAccounts.csv";

        try {
            List <String[]> newAccountHolders = utilities.CSV.read(file);
            for (String[] accountHolder : newAccountHolders) {
                String name = accountHolder[0];
                String ssN = (accountHolder[1]);
                String accountType = (accountHolder[2]);
                double initDeposit = Double.parseDouble(accountHolder[3]);
                if (accountType.equals("Savings")) {
                    accounts.add(new Savings(name,ssN,initDeposit));
                }
                else if(accountType.equals("Checking")){
                    accounts.add(new Checking(name,ssN,initDeposit));
                }
                else{
                    System.out.println("Error reading account type.");
                }
            } } catch(IOException e){
                System.out.println("File not found!");
                e.printStackTrace();
            }
        for (Account acc : accounts) {
            System.out.println("\n********");
            acc.showInfo();
        }

        }
    }
