class TryCatchFinallyExample {
    public static void main(String[] args) {

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);   // risky code
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of range");
        } finally {
            System.out.println("Finally block executed");
        }

        System.out.println("End of program");
    }
}
