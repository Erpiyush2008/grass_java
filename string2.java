public class string2 {
    public static void main(String[] args) {
        String str = "my name is piyush";
        String[] words = str.split(" ");
        String ans= "";
        for (int k = 0; k < words.length; k++) {
            String word = words[k];
            String rev = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);
            }

            ans += rev + " ";
        }

        System.out.println(ans);
    }
}