import java.util.ArrayList;

public class RollerCoaster extends Attraction {

    // CONSTRUCTOR
    public RollerCoaster(String name, float entrance, byte minAge, int colection, int users) {
        super(name, entrance, minAge, colection, users);
    }

    static public void useAttraction(ArrayList<User> clientsList, int index){
        User user = clientsList.get(index);
        int cost = 8;
        double height = 1.4;

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

    public void paint(int meters) {
        int totalCost;
        totalCost = meters * 10;
        System.out.println("\n**********************************");
        System.out.printf("%d meters can be painted!", totalCost);
        System.out.println("**************************************\n");
    }
}
