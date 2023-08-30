public class User {

    // ATRIBUTTES
    private String name;
    private double height;
    private double balance;

    // CONSTRUCTOR
    public User(String name, double height) {
        this.name = name;
        this.height = height;
        this.balance = 0;
    }

    // GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /*****************************************************************************************************
     * [METHOD: deposit()]
     *****************************************************************************************************/
    public void deposit(double deposit) {
        this.setBalance(this.balance + deposit);
        System.out.println("\n********************");
        System.out.println("\nDeposit successful!");
        System.out.println("*********************\n");
    }

    /*****************************************************************************************************
     * [METHOD: withdraw()]
     *****************************************************************************************************/
    public void withdraw(double withdraw) {
        if (this.balance >= withdraw) {
            this.setBalance(this.getBalance() - withdraw);
            System.out.println("\n*********************");
            System.out.print("Withdrawal successful!");
            System.out.println("***********************\n");
        } else {
            System.out.println("\n**********************************************************");
            System.out.println("Insufficient funds! You can withdraw: " + this.getBalance());
            System.out.println("***********************************************************\n");
        }
    }
}
