import java.util.*;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target sum:");
        int target = sc.nextInt();

        Map<Integer, List<Integer>> map = new HashMap<>();
        int cum_sum = 0;

        // Important: handle subarrays starting from index 0
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        boolean found = false;

        for(int i = 0; i < n; i++) {
            cum_sum += arr[i];

            if(map.containsKey(cum_sum - target)) {
                for(int startIndex : map.get(cum_sum - target)) {
                    found = true;
                    System.out.print("Sub-array with sum " + target + ": ");
                    for(int j = startIndex + 1; j <= i; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                }
            }

            map.putIfAbsent(cum_sum, new ArrayList<>());
            map.get(cum_sum).add(i);
        }

        if(!found) {
            System.out.println("No sub-array with given sum found.");
        }

        sc.close();
    }
}
