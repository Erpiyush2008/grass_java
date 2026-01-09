public class name {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            // P
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || j == 1 || (j == 5 && i == 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print(" ");

            // I
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 3)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print(" ");

            // Y
            for (int j = 1; j <= 5; j++) {
                if ((i == j && i <= 3) || (i + j == 6 && i <= 3) || (j == 3 && i > 3))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print(" ");

            // U
            for (int j = 1; j <= 5; j++) {
                if ((j == 1 || j == 5) && i != 5 || (i == 5))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print(" ");

            // S
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || i == 5 || (j == 1 && i == 2) || (j == 5 && i == 4))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print(" ");

            // H
            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || i == 3)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
