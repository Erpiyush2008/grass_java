class arr2 {

    public static void main(String[] args) {

        int arr[] = {1, 7, 5, 0, 4, 3};

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            } else {
                i++;
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
