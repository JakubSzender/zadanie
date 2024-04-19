import java.util.Scanner;

public class zad2 {

    public void zad2()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wysokość trójkąta: ");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for(int k = height-i; k > 0 ; k--)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
