import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        UchBurch T = new UchBurch();
        Scanner sd = new Scanner(System.in);
        System.out.println("enter sides of triangle : ");
        T.a = sd.nextDouble();
        T.b = sd.nextDouble();
        T.c = sd.nextDouble();
        T.area(T.a, T.b, T.c);
    }
}
