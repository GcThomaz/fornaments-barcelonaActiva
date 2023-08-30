import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) throws Exception {

        ArrayList<Client> clientList = new ArrayList<Client>();
        Menu(clientList);
    }

    /*****************************************************************************************************
     * [Menu]
     ******************************************************************************************************/
    static void Menu(ArrayList<Client> clientList) {
        int option = -1;


        while (option != 0) {
            System.out.println();
            System.out.println("***** MENU *****");
            System.out.println("1. Create Client");
            System.out.println("2. Remove Client");
            System.out.println("3. Create Bank Account");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. See Client Informations");
            System.out.println("0. Leave");
            System.out.println("****************");
            System.out.println();

            option = asknumber("Type the option:");

            
            switch (option) {
                case 1: // Create Client
                    String name = askString("What's the client's name?");
                    String lastName = askString("What's the client's last name?");
                    createClient(clientList, name, lastName, indexClient(clientList, name, lastName));
                    break;
                case 2: // Remove Client
                    String deleteName = askString("Type the name of the client do you want to remove:");
                    String deleteLastName = askString("Type the last name of the client do you want to remove:");
                    deleteClient(clientList, indexClient(clientList, deleteName, deleteLastName));
                    break;
                case 3:
                    if (clientList.size() > 0) {
                        String nameClientAccount = askString(
                                "Type the name of the client do you want to create an account:");
                        String lastNameClientAccount = askString(
                                "Type the last name of the client do you want to remove:");
                        Integer accountNumber = asknumber("Type the account number: ");
                        createAccount(clientList, nameClientAccount, lastNameClientAccount,
                                accountNumber);
                    } else {
                        System.out.println("\nYou need to register a client first!\n");
                    }
                    break;
                case 4:
                    if (clientList.size() > 0) {
                        String depositName = askString("Type the name of the client to make the deposit:");
                        String depositLast = askString("Type the the last name:");
                        Integer depositAccount = asknumber("Type the account number:");
                        Integer depositNumber = asknumber("Type the amount:");
                        Integer client = indexClient(clientList, depositName, depositLast);
                        Integer conta = Client.indexAccount(clientList, depositName, depositLast,
                                depositAccount);
                        if (client != -1 && conta != -1) {
                            clientList.get(client).getAccountsList().get(conta).deposit(depositNumber);
                        } else {
                            System.out.println("\nUser or account does not exist!\n");
                        }

                    } else {
                        System.out.println("\nYou need to register a client and an account first!\n");
                    }
                    break;
                case 5:
                    if (clientList.size() > 0) {
                        String withdrawName = askString("Type the name:");
                        String withdrawLastName = askString("The the last name:");
                        Integer withdrawAccount = asknumber("Type the account number:");
                        Integer withdrawNumber = asknumber("Type the amount:");
                        Integer client = indexClient(clientList, withdrawName, withdrawLastName);
                        Integer conta = Client.indexAccount(clientList, withdrawName, withdrawLastName,
                                withdrawAccount);
                        if (client != -1 && conta != -1) {
                            clientList.get(client).getAccountsList().get(conta).withdraw(withdrawNumber);
                        } else {
                            System.out.println("\nUser or account does not exist!\n");
                        }
                    } else {
                        System.out.println("\nYou need to register a client and an account first!\n");
                    }

                    break;
                case 6:
                    String seeName = askString("Type the name of the client do you want to see:");
                    String seeLastName = askString("Type the last name of the client do you want to see:");
                    seeClient(clientList, seeName, seeLastName);
                    break;
                case 0:
                    System.out.println("Bye!");
                    break;

                default:
                    System.out.println("Invalid option! Enter a valid number.");
                    break;
            }
        }
    }

    /*****************************************************************************************************
     * [METHOD: createClient]
     ******************************************************************************************************/
    static void createClient(ArrayList<Client> clientsList, String name,
            String lastName, int index) {

        if (name == null || name.isEmpty()) {
            System.out.println("\n******************************************");
            System.out.println("Please, you need to type the FIRST name of the client!!!");
            System.out.println("******************************************");
        } else if (lastName == null || lastName.isEmpty()) {
            System.out.println("\n******************************************");
            System.out.println("Please, you need to type the LAST name of the client!!!");
            System.out.println("******************************************");
        } else if (!isAlphabetic(name)) {
            System.out.println("\n***************************************************");
            System.out.println("The FIRST name must contain only letters of the alphabet!");
            System.out.println("***************************************************");
        } else if (!isAlphabetic(lastName)) {
            System.out.println("\n***************************************************");
            System.out.println("The LAST name must contain only letters of the alphabet!");
            System.out.println("***************************************************");
        } else if (index == -1) {
            Client client = new Client(name, lastName);
            clientsList.add(client);
            System.out.println("\nClient created successfully!\n");
        } else {
            System.out.println("\nClient already exists!\n");
        }
    }

    /*****************************************************************************************************
     * [METHOD: deleteClient]
     *****************************************************************************************************/
    static void deleteClient(ArrayList<Client> clientsList, int index) {
        if (index != -1) {
            clientsList.remove(clientsList.get(index));
            System.out.println("Client removed!");
        } else {
            System.out.println("\nCannot not remove! This client dosn't exist in our Bank!\n");
        }
    }

    /*****************************************************************************************************
     * [METHOD: createAccount]
     ******************************************************************************************************/
    static void createAccount(ArrayList<Client> clientList, String name, String lastName, Integer number) {
        int index = indexClient(clientList, name, lastName);

        Account account = new Account(number);
        clientList.get(index).addAccount(account);
        System.out.println("\nAccount created successfully!\n");
    }

    /*****************************************************************************************************
     * [METHOD: seeHotel]
     *****************************************************************************************************/
    static void seeClient(ArrayList<Client> clientsList, String name, String lastName) {
        int index = indexClient(clientsList, name, lastName);

        if (name == null || lastName == null || name.isEmpty() || lastName.isEmpty()) {
            System.out.println("\n******************************************");
            System.out.println("PLEASE, TYPE THE FULL NAME OF THE CLIENT!!");
            System.out.println("******************************************");
        } else if (!isAlphabetic(name) || !isAlphabetic(lastName)) {
            System.out.println("\n***************************************************");
            System.out.println("THE NAME MUST CONTAIN ONLY LETTERS OF THE ALPHABET!");
            System.out.println("***************************************************");
        } else if (index != -1) {
            Client client = clientsList.get(index);
            System.out.println("\nName of the client: " + name + " " + lastName + ".");

            if (client.getAccountsList() != null) {
                System.out.println("Number of Accounts: " + client.getAccountsList().size() + ".");

                if (client.getAccountsList().size() != 0) {

                    System.out.println("\nUser's accounts: ");
                    for (Account account : client.getAccountsList()) {
                        System.out.println("\nAccount: " + account.getAccountNumber());
                        System.out.println("\nBalance Account: " + account.getAccountBalance());
                    }
                } else {
                    System.out.println();
                }

            } else {
                System.out.println("\n**********************************");
                System.out.println("THIS USER DON'T HAVE AN ACCOUNT!!!");
                System.out.println("**********************************");
            }

        } else {
            System.out.println("\n******************************************************");
            System.out.println("THIS CLIENT DOES NOT EXIST IN OUR BANK ACCOUNT LIST!!!");
            System.out.println("******************************************************");
        }
    }

    /*****************************************************************************************************
     * [METHOD: Get String]
     *****************************************************************************************************/
    static String askString(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        // in.close();
        return in.nextLine();
    }

    /*****************************************************************************************************
     * [METHOD: Get number]
     *****************************************************************************************************/
    static int asknumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        // in.close();
        return in.nextInt();
    }

    /*****************************************************************************************************
     * [METHOD: Search Index Client]
     *****************************************************************************************************/
    static int indexClient(ArrayList<Client> clientsList, String name, String lastName) {
        int index = -1;
        int counter = 0;
        int cells = clientsList.size();
        boolean found = false;

        while (counter < cells && found == false) {
            if (clientsList.get(counter).getClientName().equalsIgnoreCase(name)
                    && clientsList.get(counter).getClientLastName().equalsIgnoreCase(lastName)) {
                index = counter;
                found = true;
            }
            counter++;
        }
        return index;
    }

    /*****************************************************************************************************
     * [METHOD: isAlphabetic]
     *****************************************************************************************************/
    static boolean isAlphabetic(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetter(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
