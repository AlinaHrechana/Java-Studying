package classwork.lesson3;

public class MathExamples {

    public static void main(String[] args) {

        // sqrt(x) — квадратный корень
        double sqrt = Math.sqrt(25);
        System.out.println("sqrt(25) = " + sqrt); // 5.0


        // pow(x, y) — x в степени y
        double pow = Math.pow(2, 3);
        System.out.println("pow(2, 3) = " + pow); // 8.0


        // sin(x) — синус (x в радианах)
        double sin = Math.sin(Math.PI / 2);
        System.out.println("sin(PI / 2) = " + sin); // 1.0


        // cos(x) — косинус
        double cos = Math.cos(0);
        System.out.println("cos(0) = " + cos); // 1.0


        // tan(x) — тангенс
        double tan = Math.tan(Math.PI / 4);
        System.out.println("tan(PI / 4) = " + tan); // ~1.0


        // asin(x) — арксинус
        double asin = Math.asin(1);
        System.out.println("asin(1) = " + asin); // PI / 2


        // acos(x) — арккосинус
        double acos = Math.acos(0);
        System.out.println("acos(0) = " + acos); // PI / 2


        // atan(x) — арктангенс
        double atan = Math.atan(1);
        System.out.println("atan(1) = " + atan); // PI / 4


        // atan2(y, x) — угол по координатам y и x
        double atan2 = Math.atan2(1, 1);
        System.out.println("atan2(1, 1) = " + atan2); // PI / 4


        // toRadians(x) — градусы -> радианы
        double radians = Math.toRadians(180);
        System.out.println("toRadians(180) = " + radians); // PI

        // toDegrees(x) — радианы -> градусы
        double degrees = Math.toDegrees(Math.PI);
        System.out.println("toDegrees(PI) = " + degrees); // 180.0


        // exp(x) — e^x
        double exp = Math.exp(2);
        System.out.println("exp(2) = " + exp); // ~7.389


        // log(x) — натуральный логарифм ln(x)
        double log = Math.log(Math.E);
        System.out.println("log(E) = " + log); // 1.0


        // round(x) — округление до ближайшего целого
        long round = Math.round(5.6);
        System.out.println("round(5.6) = " + round); // 6


        // ceil(x) — ближайшее целое ВВЕРХ
        double ceil = Math.ceil(5.1);
        System.out.println("ceil(5.1) = " + ceil); // 6.0


        // floor(x) — ближайшее целое ВНИЗ
        double floor = Math.floor(5.9);
        System.out.println("floor(5.9) = " + floor); // 5.0


        // abs(x) — абсолютное значение
        int abs = Math.abs(-10);
        System.out.println("abs(-10) = " + abs); // 10


        // max(x, y) — большее из двух
        int max = Math.max(10, 20);
        System.out.println("max(10, 20) = " + max); // 20


        // min(x, y) — меньшее из двух
        int min = Math.min(10, 20);
        System.out.println("min(10, 20) = " + min); // 10
    }

}
