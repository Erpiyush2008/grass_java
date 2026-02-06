class MultipleCatchExample {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception handled");
        } catch (Exception e) {
            System.out.println("General Exception handled");
        }
    }
}
