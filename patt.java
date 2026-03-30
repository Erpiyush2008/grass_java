public class patt {
    public static void main(String[] args) {

        int num = 30;

        int diff = 2;
        while (num >= 0) {
            System.out.print(num + " ");
            num = num - diff;
            diff += 2;
        }

        num = 0;
        diff = 2;

        while (num <= 30) {
            num = num + diff;
            System.out.print(num + " ");
            diff += 2;
        }
    }
}