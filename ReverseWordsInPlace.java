import java.util.Scanner;

public class ReverseWordsInPlace {
    public static void reverse(char[] arr, int start, int end){
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        int n = arr.length;
        
        // reverse individual words
        int start = 0;
        for(int end = 0; end <= n; end++){
            if(end == n || arr[end] == ' '){
                reverse(arr, start, end-1);
                start = end+1;
            }
        }
        
        // reverse the whole string
        reverse(arr, 0, n-1);
        
        System.out.println("Reversed: " + new String(arr));
    }
}