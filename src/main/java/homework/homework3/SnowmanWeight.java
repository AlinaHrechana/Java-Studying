package homework.homework3;

public class SnowmanWeight {

    public static void main(String[] args) {


        double r1 = 1;
        double r2 = 0.5;
        double r3 = 0.2;
        double p = 0.7;
        double g = 9.81;

        double v1 = 4.0 / 3.0 * Math.PI * Math.pow(r1, 3);
        double v2 = 4.0 / 3.0 * Math.PI * Math.pow(r2, 3);
        double v3 = 4.0 / 3.0 * Math.PI * Math.pow(r3, 3);

        double m1 = v1 * p;
        double m2 = v2 * p;
        double m3 = v3 * p;

        double p1 = m1 * g;
        double p2 = m2 * g;
        double p3 = m3 * g;

        double snowmanWeight = p1 + p2 +p3;

        System.out.println("SnowmanWeight: " + snowmanWeight);





    }

}
