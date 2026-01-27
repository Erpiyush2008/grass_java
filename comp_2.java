class comp_2{
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 1, 3, 5};

       
        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }

        System.out.println();


        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    count++;
                }
            }

            if (count > 0) {
                System.out.print(count + " ");
            }
        }
    }
}
