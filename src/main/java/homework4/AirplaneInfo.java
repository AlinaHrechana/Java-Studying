package homework4;

public class AirplaneInfo {

    public static void printAirplaneInfo(String type, String model) {

        System.out.println("Airplane info - " + "Type: " + type + ", Model: " + model);
    }
    public static void printAirplaneInfo(String type, String model, int economySeats) {

        System.out.println("Airplane info - " + "Type: " + type + ", Model: " + model + ", Economy seats: " + economySeats);
    }
    public static void printAirplaneInfo(String type, String model, int economySeats, int businessSeats) {

        System.out.println("Airplane info - " + "Type: " + type + ", Model: " + model + ", Economy seats: " + economySeats + ", Business seats: " + businessSeats);
    }
    public static void main(String[] args) {

        printAirplaneInfo("Jet", "F-22 Raptor");

        printAirplaneInfo("Airliner", "Aerobus 737", 120);

        printAirplaneInfo("Airliner", "Boeing 777", 180 , 28);
    }
    }
