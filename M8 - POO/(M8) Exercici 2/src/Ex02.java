import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        ArrayList<Hotel> hotels = new ArrayList<>();
        Menu(hotels);
    }

    /*****************************************************************************************************
     * [Menu]
     ******************************************************************************************************/
    static void Menu(ArrayList<Hotel> hotels) {
        int option = 0;

        while (option != 5) {
            System.out.println("***** MENU *****");
            System.out.println("1. Create hotel");
            System.out.println("2. Remove hotel");
            System.out.println("3. See hotel");
            System.out.println("4. Modify hotel");
            System.out.println("5. Leave");
            System.out.println("****************");

            option = asknumber("Type the option:");
            switch (option) {
                case 1:
                    String nameHotel = askString("Type the name of the hotel: ");
                    int roomsHotel = asknumber("Type the number of rooms: ");
                    int floorsHotel = asknumber("Type the number of floors: ");
                    double areaHotel = asknumber("Type the area:");
                    createHotel(hotels, nameHotel, roomsHotel, floorsHotel, areaHotel);
                    break;
                case 2:
                    String deleteName = askString("Type the name of the hotel you want to delete: ");
                    deleteHotel(hotels, indexHotel(hotels, deleteName));
                    break;
                case 3:
                    String seeName = askString("Type the name of the hotel you want to see: ");
                    seeHotel(hotels, seeName);
                    break;
                case 4:
                    String modifyName = askString("Type the name of the hotel you want to modify: ");
                    modifyHotel(hotels, modifyName);
                    break;
                case 5:
                    System.out.println("Bye!");
                    break;

                default:
                    System.out.println("Invalid option! Enter a valid number.");
                    break;
            }
        }
    }

    /*****************************************************************************************************
     * [Méthods createHotel]
     ******************************************************************************************************/
    static void createHotel(ArrayList<Hotel> hotels, String name, int numberOfRooms, int numberOfFloors,
            double totalHotelArea) {

        Hotel hotel = new Hotel(name, numberOfRooms, numberOfFloors, totalHotelArea);
        hotels.add(hotel);

        System.out.println("\nHotel created successfully!\n");
    }

    /*****************************************************************************************************
     * [Méthods deleteHotel]
     *****************************************************************************************************/
    static void deleteHotel(ArrayList<Hotel> hotels, int index) {

        if (index != -1) {
            hotels.remove(hotels.get(index));
            System.out.println("Removed!");
        } else {
            System.out.println("This hotel dosn't exist in our list!");
        }
    }

    /*****************************************************************************************************
     * [Méthods seeHotel]
     *****************************************************************************************************/
    static void seeHotel(ArrayList<Hotel> hotels, String name) {
        int index = indexHotel(hotels, name);

        if (name == null || name.isEmpty()) {
            System.out.println("\n******************************************");
            System.out.println("PLEASE, TYPE THE NAME OF THE HOTEL!!");
            System.out.println("******************************************");
        } else if (index != -1) {
            Hotel hotel = hotels.get(index);
            System.out.println("\nName of the hotel: " + name);
            System.out.println("Number of Rooms: " + hotel.getNumberOfRooms() + ".");
            System.out.println("Number of Floors: " + hotel.getNumberOfFloors() + ".");
            System.out.println("Total area: " + hotel.getTotalHotelArea() + "m².\n");
            hotel.calculateMaintenance();
        } else {
            System.out.println("\nThe hotel " + name + " is not in our Hotel List!\n");
        }
    }

    /*****************************************************************************************************
     * [Méthods modifyHotel]
     *****************************************************************************************************/
    static void modifyHotel(ArrayList<Hotel> hotels, String name) {
        int newNumberOfRooms;
        int newNumberOfFloors;
        int newTotalHotelArea;
        int option;
        int index = indexHotel(hotels, name);
        Hotel hotel = hotels.get(index);

        if (index != -1) {
            System.out.println("*********** MENU [Modify] ******");
            System.out.println("What do you want to modify?");
            System.out.println("1. Number of rooms");
            System.out.println("2. Number of floors");
            System.out.println("3. Total hotel area");
            System.out.println("4. Leave");

            option = asknumber("Type the option: ");

            switch (option) {
                case 1:
                    newNumberOfRooms = asknumber("Type the new number of rooms:");
                    hotel.setNumberOfRooms(newNumberOfRooms);
                    System.out.println("Number of rooms modified successfully!\n");
                    break;
                case 2:
                    newNumberOfFloors = asknumber("Type the new number of floors:");
                    hotel.setNumberOfFloors(newNumberOfFloors);
                    System.out.println("Number of floors modified successfully!\n");
                    break;
                case 3:
                    newTotalHotelArea = asknumber("Type the new area:");
                    hotel.setNumberOfFloors(newTotalHotelArea);
                    System.out.println("Total area modified successfully!\n");
                    break;
                case 4:
                    System.out.println("Bye!\n");
                    break;
                default:
                    System.out.println("Invalid option! Try again.\n");
                    break;
            }
        } else {
            System.out.println("The hotel " + name + " is not in our Hotel List!\n");
        }
    }

    /*****************************************************************************************************
     * [Méthods Get String]
     *****************************************************************************************************/
    static String askString(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        // in.close();
        return in.nextLine();
    }

    /*****************************************************************************************************
     * [Méthods Get number]
     *****************************************************************************************************/
    static int asknumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        // in.close();
        return in.nextInt();
    }

    /*****************************************************************************************************
     * [Méthods Search Index]
     *****************************************************************************************************/
    static int indexHotel(ArrayList<Hotel> hotels, String name) {
        int index = -1;
        int counter = 0;
        int cells = hotels.size();
        boolean found = false;

        while (counter < cells && found == false) {
            if (hotels.get(counter).getName().equalsIgnoreCase(name)) {
                index = counter;
                found = true;
            }
            counter++;
        }
        return index;
    }

}
