import java.util.Scanner;

public class MovingZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Step 1: Input
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 2: Move non-zero elements
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        // Step 3: Fill zeros
        while(count < n) {
            arr[count++] = 0;
        }

        // Step 4: Output
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}