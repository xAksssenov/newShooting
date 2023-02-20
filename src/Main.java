import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int Garry;
        int Larry;
        int newGarry;
        int newLarry;
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Введите число банок для Гарри: ");

        Garry = scanner.nextInt();

        System.out.print ("Введите число банок для Ларри: ");

        Larry = scanner.nextInt();

        newGarry = (Garry + Larry - 1) - Garry;

        System.out.println ("Количество не простреленных банок для Гарри: " + newGarry);

        newLarry = (Garry + Larry - 1) - Larry;

        System.out.print ("Количество не простреленных банок для Гарри: " + newLarry);

    }
}