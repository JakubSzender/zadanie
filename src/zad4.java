import java.util.Scanner;

public class zad4 {

    public void zad4(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą nieujemną: ");
        int n = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
    }
}
