package homework.homework3;

public class SnowmanWeight {

    public static void main(String[] args) {

        double radius1 = 1;
        double radius2 = 0.5;
        double radius3 = 0.2;
        double density = 0.7;

        double volume1 = 4.0 / 3.0 * Math.PI * Math.pow(radius1, 3);
        double volume2 = 4.0 / 3.0 * Math.PI * Math.pow(radius2, 3);
        double volume3 = 4.0 / 3.0 * Math.PI * Math.pow(radius3, 3);

        double mass1 = volume1 * density;
        double mass2 = volume2 * density;
        double mass3 = volume3 * density;

        double snowmanWeight = mass1 + mass2 + mass3;

        System.out.println("SnowmanWeight: " + snowmanWeight);

    }
}
