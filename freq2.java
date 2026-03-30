public class freq2 {
    public static void main(String[] args) {

        String s = "programming";
        int n = s.length();

        int freq[] = new int[n];
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (visited[i] == true)
                continue;

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }

            freq[i] = count;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                System.out.println(s.charAt(i) + " -> " + freq[i]);
            }
        }
    }
}