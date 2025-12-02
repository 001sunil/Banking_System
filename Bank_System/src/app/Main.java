package app;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to Apex Bank");
        System.out.println("""
                1)Open Account
                2)Deposit
                3)Withdraw
                4)Transfer
                5)Account Statement
                6)List Accounts
                7)Search Accounts by Customer Name
                0)Exit
                """);

        System.out.println("Choose");
        String choice = scanner.nextLine().trim();
        System.out.println("Choice :"+choice);


    }


}
