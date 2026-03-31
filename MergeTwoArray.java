public class MergeTwoArray {

    static void merge(int[] arr1, int[] arr2, int n, int m) {
        int gap = (n + m + 1) / 2;

        while (gap > 0) {
            int i = 0;
            int j = gap;

            while (j < (n + m)) {

                // Case 1: both pointers in arr1
                if (j < n && arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }

                // Case 2: i in arr1, j in arr2
                else if (i < n && j >= n && arr1[i] > arr2[j - n]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j - n];
                    arr2[j - n] = temp;
                }

                // Case 3: both in arr2
                else if (i >= n && arr2[i - n] > arr2[j - n]) {
                    int temp = arr2[i - n];
                    arr2[i - n] = arr2[j - n];
                    arr2[j - n] = temp;
                }

                i++;
                j++;
            }

            if (gap == 1) break;
            gap = (gap + 1) / 2;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};

        merge(arr1, arr2, arr1.length, arr2.length);

        System.out.print("arr1: ");
        for (int x : arr1) System.out.print(x + " ");

        System.out.print("\narr2: ");
        for (int x : arr2) System.out.print(x + " ");
    }
}