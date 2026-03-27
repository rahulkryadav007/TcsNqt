
public class Example {
	
	public static void moveZeros(int[] arr) {
	    int j = 0;

	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] != 0) {
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            j++;
	        }
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,0,0,0,0,0,0,1,9,0,5,0};
        moveZeros(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
		

	}

}
