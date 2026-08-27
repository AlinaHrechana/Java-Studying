package classwork.lesson3;

public class TypeCasting {

    public static void main(String[] args) {

        //примеры неявных преобразований типов
        System.out.println(10);

        int intNumber = 1000;
        long longNumber = 100;
        System.out.println(longNumber);

        longNumber = intNumber;
        System.out.println(longNumber);

        byte byteNumber = 10;
        short shortNumber = 100;

        byteNumber = (byte) shortNumber;
        System.out.println(byteNumber);


    }

}
