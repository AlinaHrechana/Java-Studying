package homework.homework4;

public class Person {

    public static void main(String[] args) {

        personInfo("Will ", "Smith ", "New York ", "2936729462846");

        personInfo("Jackie ", "Chan ", "Shanghai ", "12312412412" );

        personInfo("Sherlock ", "Holmes ", "London ", "37742123513");
    }

    public static void personInfo( String name, String surname, String city, String phoneNumber){

        System.out.println("Позвонить гражданину " +  name + surname + "из города " + city + "можно по номеру " + phoneNumber);
    }
}
