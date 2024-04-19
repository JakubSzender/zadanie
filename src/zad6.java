import java.util.Scanner;
public class zad6 {
    public void Count()
    {
        var input = new Scanner(System.in);
        System.out.println("Podaj liczbę 1");
        var n = input.nextInt();
        System.out.println("Podaj liczbę 2");
        var m = input.nextInt();

        if(n < m){
            double result=1;
            for(var i = n; i <= m; i++)
            {
                result*=i;
            }
            System.out.println(result);
        }
    }

}
