import java.util.ArrayList;

public class Horses extends Attraction {

    public Horses(String name, float entrance, byte minAge, int colection, int users) {
        super(name, entrance, minAge, colection, users);
    }

    static public void useAttraction(ArrayList<User> clientsList, int index) {
        User user = clientsList.get(index);
        int cost = 2;
        double height = 1.1;

        if (user.getBalance() >= cost && user.getHeight() >= height) {
            System.out.println("\n***************************************************************************");
            System.out.printf("The user can pay the entry, has the minimum height and it cost you %d euros.", cost);
            System.out.println("\n***************************************************************************\n");

            user.setBalance(user.getBalance() - cost);
        } else {
            System.out.println("\n*******************************************************************");
            System.out.println("The user cannot pay the entry or does not have the minimum height!!!");
            System.out.println("*********************************************************************\n");
        }
    }
}
