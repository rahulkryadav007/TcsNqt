import java.util.Scanner;

public class Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Scanner sc =  new Scanner(System.in);
               System.out.println("Enter size of array:");
               int n = sc.nextInt();
               System.out.println("Enter the element");
               int[] arr = new int[n];
               for(int i = 0;i<n;i++) {
            	   arr[i] = sc.nextInt();
               }
               int count = 0;
               for(int i = 0;i<n;i++) {
            	   if(arr[i] != 0) {
            		   arr[count++] = arr[i];
            	   }
               }
               while(count < n) {
            	   arr[count++] = 0;
               }
               for(int i =0;i<n;i++) {
            	   System.out.println(arr[i] + " ");
               }
	}

}
