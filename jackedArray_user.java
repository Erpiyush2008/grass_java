import java.util.Scanner;

class jackedArray_user {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int[][] arr = new int[rows][];

        // har row ka size input
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter elements count in row " + i + ": ");
            int cols = sc.nextInt();
            arr[i] = new int[cols];
        }

        // elements input
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // print jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
