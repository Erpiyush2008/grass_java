class comp_1 {
    public static void main(String[] args) {
        int n = 6;
      

        int value = 1;
        int inc = 2;

        for (int i = 1; i <= (2 * n)- 1; i++) {
            System.out.print(value + " ");

            if (i < n) {
                value += inc;
                inc++;
            } else {
                inc--;
                value -= inc;
            }
        }
    }
}
