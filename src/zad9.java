import java.util.Scanner;

public class zad9 {
    String x = "X";
    String spaceInner;
    String spaceOuter, lastLine;
    Scanner in = new Scanner(System.in);


    public void Print() {
        System.out.println("Podaj wysokośc trójkąta");
        var h = in.nextInt();
        spaceInner = "";
        spaceOuter = "";
        lastLine = "";

        for(int k = 1; k <= h-1; k++)
        {
            spaceOuter += " ";
        }

        for(int y = 1; y <= (h*2); y++)
        {
            lastLine += "X";
        }

            for (int k = 1; k <= h-1; k++)
            {
                if(spaceOuter.isEmpty())
                {
                    spaceOuter = "";
                    break;
                }
                System.out.print(spaceOuter);
                System.out.print(x);
                System.out.print(spaceInner);
                System.out.print(x);
                spaceInner += "  ";
                System.out.println();
                spaceOuter = spaceOuter.substring(0, spaceOuter.length()-1);
            }
        System.out.println(lastLine);

    }
}
