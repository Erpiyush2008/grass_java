public class arr {

    public static void moveZero(int arr[]) {
        int j = 0; // pointer for non-zero placement

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }

    public static String capitalize(String str) {
        StringBuilder result = new StringBuilder();

        // first character always uppercase
        result.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            // if previous char is space → capitalize
            if (str.charAt(i - 1) == ' ') {
                result.append(Character.toUpperCase(str.charAt(i)));
            } else {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 5, 8, 0, 7};

        moveZero(arr);

        // print result
        for (int num : arr) {
            System.out.print(num + " ");
        }

         String str = "hii my name is christopher nolen";

        System.out.println(capitalize(str));
    }
}