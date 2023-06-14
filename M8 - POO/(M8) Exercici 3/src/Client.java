import java.util.ArrayList;

public class Client {

    /*****************************************************************************************************
     * [ATTRIBUTES]
     *****************************************************************************************************/
    private String clientName;
    private String clientLastName;
    private ArrayList<Account> accountList;

    /*****************************************************************************************************
     * [CONSTRUCTOR]
     *****************************************************************************************************/
    public Client(String clientName, String clientLastName) {
        this.clientName = clientName;
        this.clientLastName = clientLastName;
        accountList = new ArrayList<Account>();
    }

    /*****************************************************************************************************
     * [GETTERS AND SETTERS]
     *****************************************************************************************************/
    public String getClientName() {
        return clientName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public ArrayList<Account> getAccountsList() {
        return accountList;
    }

    /*****************************************************************************************************
     * [METHOD: addAccount]
     *****************************************************************************************************/
    public void addAccount(Account account) {
        accountList.add(account);
    }

    /*****************************************************************************************************
     * [METHOD: Search Index Account]
     *****************************************************************************************************/
    static int indexAccount(ArrayList<Client> clientsList, String name, String lastName, Integer accountNumber) {
        int index = -1;
        int counter = 0;
        boolean found = false;
        int indexClient = Ex03.indexClient(clientsList, name, lastName);
        ArrayList<Account> cells = clientsList.get(indexClient).getAccountsList();

        while (counter < cells.size() && found == false) {
            if (cells.get(counter).getAccountNumber().equals(accountNumber)) {
                index = counter;
                found = true;
            }
            counter++;
        }
        return index;
    }
}
