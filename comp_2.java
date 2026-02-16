class RightGreaterArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 4, 1, 3, 5};
        int n = arr.length;

        int[] temp = new int[n];
        int k = 0;


        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    count++;
                }
            }

            if (count > 0) {
                temp[k++] = count;
            }
        }

        // Step 3 & 4: final array with exact size
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }

        // Step 5: print result
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
