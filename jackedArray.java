class jackedArray {
    public static void main(String[] args) {

        int[][] arr = new int[3][];

        arr[0] = new int[]{1, 2};        // row 0 → 2 elements
        arr[1] = new int[]{3, 4, 5, 6};  // row 1 → 4 elements
        arr[2] = new int[]{7};           // row 2 → 1 element

        // print
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
