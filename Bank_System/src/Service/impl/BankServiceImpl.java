package Service.impl;

import Service.BankService;

import java.util.UUID;

public class BankServiceImpl implements BankService {
    @Override
    public String oppenAccount(String name, String email, String accountType) {

        String customerId = UUID.randomUUID().toString();

        String AccountNumber = UUID.randomUUID().toString();

//        Account a = new Account(accountNumber,accountType,(double) 0,customerId);



        return "";
    }
}
