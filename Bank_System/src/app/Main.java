package app;
import Service.BankService;
import Service.impl.BankServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankService bankservie = new BankServiceImpl();

        boolean runtime = true;

        System.out.println("Welcome to Apex Bank");

        while (runtime) {
            System.out.println("""
                    1) Open Account
                    2) Deposit
                    3) Withdraw
                    4) Transfer
                    5) Account Statement
                    6) List Accounts
                    7) Search Accounts by Customer Name
                    0) Exit
                    """);

            System.out.println("Choose");
            String choice = scanner.nextLine().trim();
            System.out.println("Choice :" + choice);

            switch (choice){

                case "1" -> openAccount(scanner,bankService);
                case "2" -> deposit(scanner);
                case "3" -> withdraw(scanner);
                case "4" -> transfer(scanner);
                case "5" -> statement(scanner);
                case "6" -> listAccount(scanner);
                case "7" -> searchAccount(scanner);




                case "0" -> runtime = false;

            }
        }

    }

    private static void openAccount(Scanner scanner,BankService bankService) {

        System.out.println("Customer Name:");
        String name = scanner.nextLine().trim();
        System.out.println("Customer Email:");
        String email = scanner.nextLine().trim();
        System.out.println("Account Type (Saving/Current):");
        String type = scanner.nextLine().trim();
        System.out.println("Initial Deposit:");
        String amountStr = scanner.nextLine().trim();
        Double initial = Double.valueOf(amountStr);

        bankService.openAccount(name,email,type);
    }

    private static void deposit(Scanner scanner) {
    }

    private static void withdraw(Scanner scanner) {
    }

    private static void transfer(Scanner scanner) {
    }

    private static void statement(Scanner scanner) {
    }

    private static void listAccount(Scanner scanner) {
    }

    private static void searchAccount(Scanner scanner) {
    }


}
