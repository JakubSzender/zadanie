import java.util.Scanner;

public class zad8 {
    int n;
    int suma = 0;
    Scanner in = new Scanner(System.in);

    public void Count() {
        System.out.println("Podaj liczbę");
        n = in.nextInt();

        for (int i = 1; i < n; i++) {
            suma += i;
        }

        System.out.println(suma);
    }
}
