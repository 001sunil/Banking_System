package domain;

public class Account {
    private String accountNumber;
    private String customerId;
    private Double balance;
    private String accountType;
    private String accountName;

    public Account(String accountNumber, String accountType, Double balance, String customerId, String accountName) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.customerId = customerId;
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


}