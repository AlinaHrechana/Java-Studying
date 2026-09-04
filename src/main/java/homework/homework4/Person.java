package homework.homework4;

public class Person {

    public static void main(String[] args) {

        System.out.println(personInfo("Will ", "Smith ", "New York ", "2936729462846"));

        System.out.println(personInfo("Jackie ", "Chan ", "Shanghai ", "12312412412"));

        System.out.println(personInfo("Sherlock ", "Holmes ", "London ", "37742123513"));

        System.out.println(personInfo("Lionel ", "Messi ", "Miami ", "13035556123 ", 33125));
    }

    public static String personInfo(String name, String surname, String city, String phoneNumber) {

       return "Позвонить гражданину " + name + surname + "из города " + city + "можно по номеру " + phoneNumber;
    }

    public static String personInfo(String name, String surname, String city, String phoneNumber, int postalCode){

        return "Позвонить гражданину " + name + surname + "из города " + city + "можно по номеру " + phoneNumber + "почтовый код " + postalCode;
    }
}
