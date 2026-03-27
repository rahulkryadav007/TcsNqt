	import java.util.Scanner;
	
	public class CountString {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	               Scanner sc  = new Scanner(System.in);
	               String s = sc.nextLine();
	               int count = 0;
	               System.out.println("Enter the word:");
	               for(char c : s.toCharArray()) {
	            	   
	            	   if("aieouAIEOU".indexOf(c) != -1)	 {
	            		   count++;
	            	   }
	               }
	               System.out.println(count);
		}
	
	}
