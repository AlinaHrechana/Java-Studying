package classwork.lesson4;

public class CarService {

    public static void main(String[] args) throws IllegalAccessException {
        // Класс имя объекта = new (это оператор конструктора) Класс
        Car car = new Car("Toyota", "Supra Mk5", "Gray", "V6"); // создать объект класса Car
        car.setEngine("V8"); // установили новое двигло
        System.out.println(car); //Распечатали тойоту
        Car bmw = new Car("BMW", "M5", "Black", "V12");
        bmw.setColor("Red");
        System.out.println(bmw);

        Car.printValues(car); // статик метод! Узнаём все поля класса машины, НЕ объекта
        System.out.println(car.getBrand()); // выводим полученный бренд машины car
    }

}