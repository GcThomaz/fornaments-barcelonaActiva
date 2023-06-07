import java.util.ArrayList;

public class Client {

    /*****************************************************************************************************
     * [ATTRIBUTES]
     *****************************************************************************************************/
    private String clientName;
    private String clientLastName;
    private ArrayList<Account> accountList = new ArrayList<Account>();

    /*****************************************************************************************************
     * [CONSTRUCTOR]
     *****************************************************************************************************/
    public Client(String clientName, String clientLastName, ArrayList<Account> accountsList) {
        this.clientName = clientName;
        this.clientLastName = clientLastName;
        this.accountList = accountsList;
    }

    /*****************************************************************************************************
     * [GETTERS AND SETTERS]
     *****************************************************************************************************/
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public ArrayList<Account> getAccountsList() {
        return accountList;
    }

    public void setAccountsList(ArrayList<Account> accountsList) {
        this.accountList = accountsList;
    }

    /*****************************************************************************************************
     * [METHOD: createAccount]
     ******************************************************************************************************/
    static void createAccount(ArrayList<Client> clientList, String name, String lastName, Integer number) {
        int index = Ex03.indexClient(clientList, name, lastName);
        
        Account account = new Account(number);
        clientList.get(index).getAccountsList().add(account);
        System.out.println("\nAccount created successfully!\n");
    }
}

