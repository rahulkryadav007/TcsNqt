
public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] arr = {40,5,30,8,20};
         
         int  first = Integer.MIN_VALUE;
         int second = Integer.MIN_VALUE;
         
           for(int num:arr) {
        	   if(num > first) {
        		   second = first;
        		   first = num;
        	   }
        	   else if (num > second && num != first) {
        		   second = num;
        	   }
           }
           
           if(second == Integer.MIN_VALUE) {
        	   System.out.println("NO second largest element");
           }else {
        	   System.out.println("second largest: " + second);
           }
	}

}
