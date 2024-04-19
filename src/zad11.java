import java.util.Random;

public class zad11 {

    zad11(){
        this.Count();
    }
    int n = 3;
    Random random = new Random();
    int max = 0;
    int min = 100;
    int sum = 0;

    public void Count() {
        System.out.println("Wylosowane liczby:");
        for (int i = 0; i < n; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println(randomNumber);
            sum += randomNumber;

            if (randomNumber > max) {
                max = randomNumber;
            }
            if (randomNumber < min) {
                min = randomNumber;
            }
        }

        double average = (double) sum / n;

        System.out.println("Największa liczba: " + max);
        System.out.println("Najmniejsza liczba: " + min);
        System.out.println("Średnia: " + average);

    }
}
