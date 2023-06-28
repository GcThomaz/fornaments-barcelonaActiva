import java.util.ArrayList;
import java.util.Scanner;

public class prova {
    public static void main(String[] args) throws Exception {
        ArrayList<User> clientsList = new ArrayList<User>();
        menu(clientsList);
    }

    /*****************************************************************************************************
     * [METHOD: menu]
     *****************************************************************************************************/
    static void menu(ArrayList<User> clients) {
        int option = -1;

        while (option != 0) {
            System.out.println();
            System.out.println("***** MENU *****");
            System.out.println("1. Create User");
            System.out.println("2. Remove User");
            System.out.println("3. Show User");
            System.out.println("4. Deposit Balance");
            System.out.println("5. Withdraw Balance");
            System.out.println("6. Use Attraction");
            System.out.println("0. Exit");
            System.out.println("****************");
            System.out.println();

            option = asknumber("Type the option:");

            switch (option) {
                case 1:
                    String nameUser = askString("Type your name: ");
                    double heightUser = askDouble("Type your height: ");
                    createUser(clients, nameUser, heightUser);
                    break;
                case 2:
                    String nameRemove = askString("Type the name: ");
                    int indexDelete = indexUser(clients, nameRemove);
                    deleteUser(clients, indexDelete);
                    break;
                case 3:
                    String nameSee = askString("Type the name: ");
                    seeUser(clients, nameSee);
                    break;
                case 4:
                    if (clients.size() > 0) {
                        String nameDeposit = askString("Type the name: ");
                        double numberDeposit = askDouble("Type the amount: ");
                        int index = indexUser(clients, nameDeposit);
                        if (index != -1) {
                            clients.get(index).deposit(numberDeposit);
                        } else {
                            System.out.println("\n***********************");
                            System.out.println("User does not exist!");
                            System.out.println("************************\n");
                        }
                    } else {
                        System.out.println("\n**********************************");
                        System.out.println("You need to register an user first!");
                        System.out.println("***********************************\n");
                    }
                    break;
                case 5:
                    if (clients.size() > 0) {
                        String nameWithdraw = askString("Type the name: ");
                        double numberWithdraw = askDouble("Type the amount: ");
                        int index = indexUser(clients, nameWithdraw);
                        if (index != -1) {
                            clients.get(index).withdraw(numberWithdraw);
                        } else {
                            System.out.println("\n***********************");
                            System.out.println("User does not exist!");
                            System.out.println("************************\n");
                        }
                    } else {
                        System.out.println("\n**********************************");
                        System.out.println("You need to register an user first!");
                        System.out.println("***********************************\n");
                    }
                    break;
                case 6:
                    int optionAttraction = -1;
                    while (optionAttraction != 0) {
                        System.out.println();
                        System.out.println("***** ATTRACTIONS *****");
                        System.out.println("1. Roller Coaster");
                        System.out.println("2. Carousel");
                        System.out.println("3. Horror House");
                        System.out.println("4. Horses");
                        System.out.println("0. Exit");
                        System.out.println("************************");
                        System.out.println();

                        optionAttraction = asknumber("Type the option:");

                        switch (optionAttraction) {
                            case 1:
                                String nameRoller = askString("Type the name: ");
                                int indexRoller = indexUser(clients, nameRoller);
                                RollerCoaster.useAttraction(clients, indexRoller);
                                break;
                            case 2:
                                String nameCarousel = askString("Type the name: ");
                                int indexCarousel = indexUser(clients, nameCarousel);
                                Carousel.useAttraction(clients, indexCarousel);
                                break;
                            case 3:
                                String nameHorror = askString("Type the name: ");
                                int indexHorror = indexUser(clients, nameHorror);
                                HorrorHouse.useAttraction(clients, indexHorror);
                                break;
                            case 4:
                                String nameHorses = askString("Type the name: ");
                                int indexHorses = indexUser(clients, nameHorses);
                                Horses.useAttraction(clients, indexHorses);
                                break;
                            case 0:
                                System.out.println("Bye!!!");
                                break;

                            default:
                                System.out.println("\nInvalid Option. Try again!\n");
                                break;
                        }
                    }
                case 0:
                    System.out.println("Bye!!!");
                    break;
                default:
                    System.out.println("\nInvalid Option. Try again!\n");
                    break;
            }
        }
    }

    /*****************************************************************************************************
     * [METHOD: createUser]
     *****************************************************************************************************/
    static void createUser(ArrayList<User> clientsList, String name, double height) {

        User user = new User(name, height);
        clientsList.add(user);
        System.out.println("\n*****************************************************");
        System.out.println("User " + user.getName() + " created successfully!!!");
        System.out.println("*****************************************************\n");
    }

    /*****************************************************************************************************
     * [METHOD: deleteUser]
     *****************************************************************************************************/
    static void deleteUser(ArrayList<User> clientsList, int index) {
        if (index != -1) {
            clientsList.remove(clientsList.get(index));
            System.out.println("\n**************");
            System.out.println("User removed!");
            System.out.println("**************\n");
        } else {
            System.out.println("\n********************************************");
            System.out.println("Cannot not remove! This user dosn't exist!");
            System.out.println("********************************************\n");
        }
    }

    /*****************************************************************************************************
     * [METHOD: seeHotel]
     *****************************************************************************************************/
    static void seeUser(ArrayList<User> clientsList, String name) {
        int index = indexUser(clientsList, name);

        if (name == null || name.isEmpty()) {
            System.out.println("\n******************************************");
            System.out.println("PLEASE, TYPE THE NAME OF THE CLIENT!!");
            System.out.println("******************************************");
        } else if (!isAlphabetic(name)) {
            System.out.println("\n***************************************************");
            System.out.println("THE NAME MUST CONTAIN ONLY LETTERS OF THE ALPHABET!");
            System.out.println("***************************************************");
        } else if (index != -1) {
            User user = clientsList.get(index);
            System.out.println("\n************************************");
            System.out.println("Name of the user: " + name + ".");
            System.out.println("Height: " + user.getHeight() + " m.");
            System.out.println("Balance: " + user.getBalance() + " euros.");
            System.out.println("************************************\n");
        } else {
            System.out.println("\n******************************************************");
            System.out.println("THIS USER DOES NOT EXIST!!!");
            System.out.println("******************************************************");
        }
    }

    /*****************************************************************************************************
     * [METHOD: Search Index Client]
     *****************************************************************************************************/
    static int indexUser(ArrayList<User> clientsList, String name) {
        int index = -1;
        int counter = 0;
        int cells = clientsList.size();
        boolean found = false;

        while (counter < cells && found == false) {
            if (clientsList.get(counter).getName().equalsIgnoreCase(name)) {
                index = counter;
                found = true;
            }
            counter++;
        }
        return index;
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
     * [METHOD: Get number]
     *****************************************************************************************************/
    static double askDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        // in.close();
        return in.nextDouble();
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
