public class zad12 {

    public void table(){
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.printf("%4d", i * j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
