import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) throws Exception {
        ArrayList<Buildings> buildingsList = new ArrayList<Buildings>();
        menu(buildingsList);
    }

    /*****************************************************************************************************
     * [METHOD: menu]
     *****************************************************************************************************/
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
                    break;
                case 2:
                    deleteBuilding(buildingsList);
                    break;
                case 3:
                    seeBuilding(buildingsList);
                    break;
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
        System.out.println("Hospital " + hospital.getBuildingName() + " created successfully!!!");
    }

    /*****************************************************************************************************
     * [METHOD: createCinema]
     *****************************************************************************************************/
    static void createCinema(ArrayList<Buildings> buildingsList, String name, int floors, double area, int capacity) {

        Cinema cinema = new Cinema(name, floors, area, capacity);
        buildingsList.add(cinema);
        System.out.println("Cinema " + cinema.getBuildingName() + " created successfully!!!");
    }

    /*****************************************************************************************************
     * [METHOD: deleteBuilding]
     *****************************************************************************************************/
    static void deleteBuilding(ArrayList<Buildings> buildingsList) {

        int deleteOption = -1;

        while (deleteOption != 0) {
            System.out.println();
            System.out.println("***** DELETE BUILDING *****");
            System.out.println("1. Delete HOTEL");
            System.out.println("2. Delete HOSPITAL");
            System.out.println("3. Delete CINEMA");
            System.out.println("0. Exit to main Menu");
            System.out.println("****************");
            System.out.println();

            deleteOption = asknumber("Type the option:");

            switch (deleteOption) {
                case 1: // delete HOTEL
                    String hotelDelete = askString("Type the name of the Hotel: ");
                    int indexDeleteHotel = indexBuilding(buildingsList, hotelDelete, Hotel.class);
                    if (indexDeleteHotel != -1) {
                        buildingsList.remove(buildingsList.get(indexDeleteHotel));
                        System.out.println("Building removed!");
                    } else {
                        System.out.println("\nCannot not remove! This building dosn't exist in our list!\n");
                    }
                    break;
                case 2: // delete HOSPITAL
                    String hospitalDelete = askString("Type the name of the Hospital: ");
                    int indexDeleteHospital = indexBuilding(buildingsList, hospitalDelete, Hospital.class);
                    if (indexDeleteHospital != -1) {
                        buildingsList.remove(buildingsList.get(indexDeleteHospital));
                        System.out.println("Building removed!");
                    } else {
                        System.out.println("\nCannot not remove! This building dosn't exist in our list!\n");
                    }
                    break;
                case 3: // delete CINEMA
                    String nameDelete = askString("Type the name of the Cinema: ");
                    int indexDeleteCinema = indexBuilding(buildingsList, nameDelete, Cinema.class);
                    if (indexDeleteCinema != -1) {
                        buildingsList.remove(buildingsList.get(indexDeleteCinema));
                        System.out.println("Building removed!");
                    } else {
                        System.out.println("\nCannot not remove! This building dosn't exist in our list!\n");
                    }
                    break;
                case 0:
                    System.out.println("\nExited the deleteBuilding() method \n");
                    break;
                default:
                    System.out.println("\nInvalid Option. Try again!\n");
                    break;
            }
        }
    }

    /*****************************************************************************************************
     * [METHOD: seeBuilding]
     *****************************************************************************************************/
    static void seeBuilding(ArrayList<Buildings> buildingsList) {

        int seeOption = -1;

        while (seeOption != 0) {
            System.out.println();
            System.out.println("***** SEE BUILDING *****");
            System.out.println("1. See HOTEL");
            System.out.println("2. See HOSPITAL");
            System.out.println("3. See CINEMA");
            System.out.println("0. Exit to main Menu");
            System.out.println("****************");
            System.out.println();

            seeOption = asknumber("Type the option:");

            switch (seeOption) {
                case 1: // see HOTEL
                    String nameHotel = askString("Type the name of the hotel:");
                    int index = indexBuilding(buildingsList, nameHotel, Hotel.class);

                    if (nameHotel.equals(null) || nameHotel.isEmpty()) {
                        System.out.println("\n******************************************");
                        System.out.println("PLEASE, TYPE THE NAME OF THE HOTEL!!");
                        System.out.println("******************************************");
                    } else if (!isAlphabetic(nameHotel)) {
                        System.out.println("\n***************************************************");
                        System.out.println("THE NAME MUST CONTAIN ONLY LETTERS OF THE ALPHABET!");
                        System.out.println("***************************************************");
                    } else if (index != -1) {
                        Buildings buildings = buildingsList.get(index);

                        if (buildings instanceof Hotel) {
                            Hotel hotel = (Hotel) buildings;
                            System.out.println("Hotel " + hotel.getBuildingName() + ".");
                            hotel.buildingClean();
                            hotel.calculateRoomService();
                            hotel.calculateSecurityCost();
                        } else {
                            System.out.println("\nInvalid Option. This building is not a Hotel.\n");
                        }

                    } else {
                        System.out.println("\n******************************************************");
                        System.out.println("THIS CLIENT DOES NOT EXIST IN OUR BANK ACCOUNT LIST!!!");
                        System.out.println("******************************************************");
                    }
                    break;
                case 2: // see HOSPITAL
                    String nameHospital = askString("Type the name of the Hospital:");
                    int indexHospital = indexBuilding(buildingsList, nameHospital, Hospital.class);

                    if (nameHospital == null || nameHospital.isEmpty()) {
                        System.out.println("\n******************************************");
                        System.out.println("PLEASE, TYPE THE NAME OF THE HOSPITAL!!");
                        System.out.println("******************************************");
                    } else if (!isAlphabetic(nameHospital)) {
                        System.out.println("\n***************************************************");
                        System.out.println("THE NAME MUST CONTAIN ONLY LETTERS OF THE ALPHABET!");
                        System.out.println("***************************************************");
                    } else if (indexHospital != -1) {
                        Buildings buildings = buildingsList.get(indexHospital);

                        if (buildings instanceof Hospital) {
                            Hospital hospital = (Hospital) buildings;
                            System.out.println("Hospital " + hospital.getBuildingName() + ".");
                            hospital.buildingClean();
                            hospital.distributeMeals();
                            hospital.calculateSecurityCost();
                        } else {
                            System.out.println("\nInvalid Option. This building is not a Hospital.\n");
                        }

                    } else {
                        System.out.println("\n******************************************************");
                        System.out.println("THIS CLIENT DOES NOT EXIST IN OUR BANK ACCOUNT LIST!!!");
                        System.out.println("******************************************************");
                    }
                    break;
                case 3: // see CINEMA
                    String nameCinema = askString("Type the name of the Cinema:");
                    int indexCinema = indexBuilding(buildingsList, nameCinema, Cinema.class);

                    if (nameCinema == null || nameCinema.isEmpty()) {
                        System.out.println("\n******************************************");
                        System.out.println("PLEASE, TYPE THE NAME OF THE CINEMA!!");
                        System.out.println("******************************************");
                    } else if (!isAlphabetic(nameCinema)) {
                        System.out.println("\n***************************************************");
                        System.out.println("THE NAME MUST CONTAIN ONLY LETTERS OF THE ALPHABET!");
                        System.out.println("***************************************************");
                    } else if (indexCinema != -1) {
                        Buildings buildings = buildingsList.get(indexCinema);

                        if (buildings instanceof Cinema) {
                            Cinema cinema = (Cinema) buildings;
                            System.out.println("Cinema " + cinema.getBuildingName() + ".");
                            cinema.buildingClean();
                            cinema.projectSession();
                            cinema.calculateSecurityCost();
                        } else {
                            System.out.println("\nInvalid Option. This building is not a Cinema.\n");
                        }

                    } else {
                        System.out.println("\n******************************************************");
                        System.out.println("THIS CLIENT DOES NOT EXIST IN OUR BANK ACCOUNT LIST!!!");
                        System.out.println("******************************************************");
                    }
                    break;
                case 0:
                    System.out.println("\nExited the method seeBuilding()\n");
                    break;
                default:
                    System.out.println("\nInvalid Option. Try again!\n");
                    break;
            }
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

    /*****************************************************************************************************
     * [METHOD: Search Index Client]
     *****************************************************************************************************/
    static int indexBuilding(ArrayList<Buildings> buildingsList, String name, Class<?> type) {
        int index = -1;
        int counter = 0;
        int cells = buildingsList.size();
        boolean found = false;

        while (counter < cells && !found) {
            Buildings building = buildingsList.get(counter);
            if (building.getBuildingName().equalsIgnoreCase(name) && type.isInstance(building)) {
                index = counter;
                found = true;
            }
            counter++;
        }
        return index;
    }
}