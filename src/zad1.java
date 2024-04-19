import java.util.Scanner;

public class zad1 {

    public void zad1()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wysokość trójkąta: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
