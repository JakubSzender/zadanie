import java.util.Scanner;
public class zad7 {
    int n,m;
    int nwd = 1;
    Scanner in = new Scanner(System.in);

    public void Count() {
        System.out.println("Podaj 1 liczbę");
        n = in.nextInt();
        System.out.println("Podaj 2 liczbę");
        m = in.nextInt();
        int min = Math.min(n, m);
        for (int i = 1; i <= min; i++) {
            if (n % i == 0 && m % i == 0) {
                nwd = i;
            }
        }
        System.out.println("NWD: " + nwd);
    }
}
