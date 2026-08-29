package homework.homework3;

public class MathTask {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        int c = 9;

        double value = Math.abs(a - b) / Math.pow(a + b, 3) - Math.sqrt(c);

        System.out.println("Value: " + value);

    }
}
