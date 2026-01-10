 public class rotateArr {
    static void leftRotate(int[] arr, int k) {
        int n = arr.length;

        for (int r = 1; r <= k; r++) {   // k times rotate
            int temp = arr[0];

            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[n - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;

        leftRotate(arr, k);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
