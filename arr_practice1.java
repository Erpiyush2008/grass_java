class arr_practice1 {

    public static boolean sorted(int number[]) {
        for (int i = 1; i < number.length; i++) {
            if (number[i - 1] > number[i]) {
                return false; // not sorted
            }
        }
        return true; // sorted
    }

    public static void main(String[] args) {

        int arr[] = {1, 7, 5, 3};

        boolean a = sorted(arr);
        System.out.println(a);
    }
}
