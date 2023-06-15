import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) throws Exception {
        ArrayList<Buildings> buildingsList = new ArrayList<Buildings>();
        menu(buildingsList);
    }

    static void menu(ArrayList<Buildings> buildingsList) {
        int option = -1;

        while (option != 0) {
            System.out.println();
            System.out.println("***** MENU *****");
            System.out.println("1. Create Building");
            System.out.println("2. Delete Building");
            System.out.println("3. Show Building");
            System.out.println("0. Leave");
            System.out.println("****************");
            System.out.println();

            option = asknumber("Type the option:");

            switch (option) {
                case 1:
                    createBuilding(buildingsList);
                case 2:
                    deleteBuilding(buildingsList);
                    break;
                case 3:

                    break;
                case 0:

                    break;

                default:
                    break;
            }
        }
    }

    /*****************************************************************************************************
     * [METHOD: createBuilding]
     *****************************************************************************************************/
    static void createBuilding(ArrayList<Buildings> buildingsList) {
        int createOption = -1;

        while (createOption != 0) {
            System.out.println();
            System.out.println("***** CREATE BUILDING *****");
            System.out.println("1. Create HOTEL");
            System.out.println("2. Create HOSPITAL");
            System.out.println("3. Create CINEMA");
            System.out.println("0. Exit to main Menu");
            System.out.println("****************");
            System.out.println();

            createOption = asknumber("Type the option:");

            switch (createOption) {
                case 1: // create HOTEL
                    String hotelName = askString("Type the name of the hotel: ");
                    int hotelFloors = asknumber("Type the number of floors: ");
                    double hotelArea = asknumber("Type the area of the hotel: ");
                    int hotelRooms = asknumber("Type the number of rooms: ");
                    createHotel(buildingsList, hotelName, hotelFloors, hotelArea, hotelRooms);
                    break;
                case 2: // create HOSPITAL
                    String hospitalName = askString("Type the name of the hospital: ");
                    int hospitalFloors = asknumber("Type the number of floors of the hospital: ");
                    double hospitalArea = asknumber("Type the area of the hospital: ");
                    int hospitalPatients = asknumber("Type the number of patients of the hospital: ");
                    createHospital(buildingsList, hospitalName, hospitalFloors, hospitalArea, hospitalPatients);
                    break;
                case 3: // create CINEMA
                    String cinemaName = askString("Type the name of the cinema: ");
                    int cinemaFloors = asknumber("Type the number of floors of the cinema: ");
                    double cinemaArea = asknumber("Type the area of the cinema: ");
                    int cinemaCapacity = asknumber("Type the number of capacity of the cinema: ");
                    createCinema(buildingsList, cinemaName, cinemaFloors, cinemaArea, cinemaCapacity);
                    break;
                case 0:
                    System.out.println("\nExited the createBuilding() method \n");
                    break;
                default:
                    System.out.println("\nInvalid Option. Try again!\n");
                    break;
            }
        }
    }

    /*****************************************************************************************************
     * [METHOD: createHotel]
     *****************************************************************************************************/
    static void createHotel(ArrayList<Buildings> buildingsList, String name, int floors, double area, int rooms) {

        Hotel hotel = new Hotel(name, floors, area, rooms);
        buildingsList.add(hotel);
        System.out.println("Hotel " + hotel.getBuildingName() + " created successfully!!!");
    }

    /*****************************************************************************************************
     * [METHOD: createHospital]
     *****************************************************************************************************/
    static void createHospital(ArrayList<Buildings> buildingsList, String name, int floors, double area, int patients) {

        Hospital hospital = new Hospital(name, floors, area, patients);
        buildingsList.add(hospital);
        System.out.println("Hotel " + hospital.getBuildingName() + " created successfully!!!");
    }

    /*****************************************************************************************************
     * [METHOD: createCinema]
     *****************************************************************************************************/
    static void createCinema(ArrayList<Buildings> buildingsList, String name, int floors, double area, int capacity) {

        Cinema cinema = new Cinema(name, floors, area, capacity);
        buildingsList.add(cinema);
        System.out.println("Hotel " + cinema.getBuildingName() + " created successfully!!!");
    }

    /*****************************************************************************************************
     * [METHOD: deleteBuilding]
     *****************************************************************************************************/
    static void deleteBuilding(ArrayList<Buildings> buildingsList) {
        
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
