public class Account {
    /*****************************************************************************************************
     * [ATTRIBUTES]
     *****************************************************************************************************/
    private Integer accountNumber;
    private Integer accountBalance = 0;

    /*****************************************************************************************************
     * [CONSTRUCTOR]
     *****************************************************************************************************/
    public Account(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    /*****************************************************************************************************
     * [GETTERS AND SETTERS]
     *****************************************************************************************************/
    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Integer accountBalance) {
        this.accountBalance = accountBalance;
    }

    /*****************************************************************************************************
     * [METHOD: deposit]
     *****************************************************************************************************/
    public void deposit(Integer deposit) {
        this.setAccountBalance(this.getAccountBalance() + deposit);
        System.out.println("Deposit successful!");
    }

    /*****************************************************************************************************
     * [METHOD: withdraw]
     *****************************************************************************************************/
    public void withdraw(Integer deposit) {
        if (this.getAccountBalance() >= deposit) {
            this.setAccountBalance(this.getAccountBalance() - deposit);
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient funds! You can withdraw: " + this.getAccountBalance());
        }

    }
}
