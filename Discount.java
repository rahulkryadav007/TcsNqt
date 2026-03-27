import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner sc  =  new Scanner(System.in);
		   System.out.println("Enter the amount:");
		   int n = sc.nextInt();
		   
		//System.out.println("Enter the amount:");
		double discount;
		
		
		if(n < 1000) {
			discount = 0.05;
		}
		else if(n < 5000) {
			discount = 0.10;
		}
		else {
			discount = 0.15;
		}
		
		double finalamount = n * (1 - discount);
		System.out.println(finalamount);
	}

}
