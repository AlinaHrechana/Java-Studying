package classwork.lesson4;

import java.lang.reflect.Field;

public class Car { // класс - модель машины (любой)

    String brand; //поля любой машины (есть у любой)
    String model;
    String color;
    String engine;
    String date;
    String price;

    public Car(String inputBrand, String model, String color, String engine) { //конструктор модификатор + класс (имя)
        this.brand = inputBrand; //this - берёт поле и приравнивает к параметру
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public void setColor(String color) { // метод меняет цвет машины
        this.color = color;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return "Car: " + brand + " " + model + " " + color + " " + engine + " " + date + " " + price;
    }

    public String getBrand() { //получить бренд конкретной машины
        return brand;
    }

    public static void printValues(Car car) throws IllegalAccessException {// распечатать все поля класса (не зависит от объекта)
        Class<?> clazz = car.getClass();

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            System.out.println(field.getName() + " = " + field.get(car));
        }
    }
}