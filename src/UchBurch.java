public class UchBurch {
    double a, b, c;

    public void area(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            double p = (a + b + c) / 2; // полупериметр
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c)); // формула Герона

            System.out.println(" ######## area of triagle : " + area);
        } else {
            System.out.println("uncorrected sides of triangle!!! try again ");

        }

    }
}
