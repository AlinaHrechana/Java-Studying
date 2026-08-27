package classwork.lesson3;

public class JavaMath {

    public static void main(String[] args) {

        int result = Math.abs(-200);

        //abs - модуль

        System.out.println("result = " + result);

        double pow = Math.pow(2, 8);
        System.out.println("pow = " + pow);

        long round = Math.round(5.9);
        System.out.println("round = " + round);

        double random = Math.random();
        System.out.println("random = " + ((int) (random * 100)));

        //*100 - предел random = 100;

    }

}
