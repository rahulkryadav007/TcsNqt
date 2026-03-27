import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Scanner sc  = new Scanner(System.in);
              System.out.println("Enter the number");
              int n = sc.nextInt();
              System.out.println("Enter the values");
       
              int[] arr = new int[n];
              for(int i=0;i<n;i++) {
            	  arr[i] = sc.nextInt();
              }
              
              int count = 1;
              int max = arr[0];
              for(int i =0;i<n;i++) {
            	  if(arr[i] > max) {
            		  count++;
            		  max = arr[i];
            	  }
              }
              
              
             System.out.println(count);
	}

}
