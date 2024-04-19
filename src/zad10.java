import java.util.Scanner;

public class zad10 {

    zad10(int number){
        this.Count(number);
    }

    public void Count(int number)
    {
        String dzielniki = "";

        while (number > 1) {
            if(number%2 == 0)
            {
                dzielniki += " 2";
                number = number/2;
            }
            else if(number%3 == 0){
                dzielniki += " 3";
                number = number/3;
            }
            else if(number%4 == 0){
                dzielniki += " 4";
                number = number/4;
            }
            else if(number%5 == 0){
                dzielniki += " 5";
                number = number/5;
            }
            else {
                dzielniki += " " + number;
                number = 1;
            }
        }

        System.out.println("Dzielniki: "+ dzielniki);
    }

}
