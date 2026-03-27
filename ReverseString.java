import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Scanner sc  = new Scanner(System.in);
                System.out.println("Enter a word");
                String input = sc.nextLine();
                String rev = "";
                
                for(int i =input.length()-1;i >= 0;i--) {
                	rev = rev + input.charAt(i);
                }
                
                System.out.println("Reverse String:" + rev);
	}

}
