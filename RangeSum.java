import java.util.Scanner;

public class RangeSum {
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("Enter a two integer(start end):");
    	   int start = sc.nextInt();
    	   int end =  sc.nextInt();
    	   
    	   int sumEnd =  end * (end+1)/2;
    	   int sumStartMinus = (start -1) * start / 2;
    	   
    	   int sum = sumEnd - sumStartMinus;
    	   
    	   System.out.println("Sum from " + start + " to " + end + " is: "  + sum);
    	   sc.close();
    	   
       }
}
