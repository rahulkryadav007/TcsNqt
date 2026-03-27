import java.util.Scanner;

public class Parking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String input = sc.next(); 
            int n = Integer.parseInt(input);

            if (n < 0) {
                System.out.println("Error");
                return;
            }

            int total = 0;

            if (n <= 2) {
                total = n * 100;
            } 
            else if (n <= 5) {
                total = (2 * 100) + (n - 2) * 50;
            } 
            else {
                total = (2 * 100) + (3 * 50) + (n - 5) * 20;
            }

            System.out.println(total);

        } catch (Exception e) {
            System.out.println("Error");
        }

        sc.close();
    }
}