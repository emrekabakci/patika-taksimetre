import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe;
        double tarife = 2.20, tutar;
        Scanner inp = new Scanner(System.in);

        System.out.print("Gidilen mesafeyi KM cinsinden giriniz : ");

        mesafe = inp.nextInt();

        tutar = mesafe * tarife + 10;

        if (tutar < 20) {

            tutar = 20;
        }
        System.out.print("Toplam Tutar : " + tutar + "TL");
    }
}