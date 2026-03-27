import java.util.Scanner;

public class GymMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
         System.out.println("Enter the durations(in months)");
         int months = sc.nextInt();
         
         int cost;
         switch(months) {
         case 1:
        	 cost = 2000;
        	 break;
         case 3:
        	 cost = 5000;
        	 break;
         case 6:
        	 cost = 9000;
        	 break;
         case 9:
        	 cost = 12000;
        	 break;
         case 12:
        	 cost = 15000;
        	 break;
        	 
        	 default:
        		 System.out.println("Error:	Invalid membership duration");
        		 return;
         }
         
         System.out.println("Total Cost:" + cost);
	}
	

}