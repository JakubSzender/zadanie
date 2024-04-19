import java.util.Scanner;

public class zad9b {
    String lastLine;
    Scanner in = new Scanner(System.in);


    public void Print() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wysokość trójkąta: ");
        int height = scanner.nextInt();
        lastLine="";

        for(int y = 1; y <= (height*2); y++)
        {
            lastLine += "x";
        }

        for (int i = 0; i < height - 1; i++) {
            for (int j = height-i; j > 0; j--) {
                System.out.print("  ");
            }
            System.out.print("x");
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("  ");
            }
            if (i > 0) {
                System.out.print("x");
            }
            System.out.println();
        }
        System.out.print(lastLine);
    }
}
