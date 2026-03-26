import java.util.*;

public class StringHandlingDemo {
    public static void main(String[] args) {

        // 1. String Constructors & Literals
        String s1 = "Hello";
        String s2 = new String("World");

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // 2. Length
        System.out.println("Length of s1: " + s1.length());

        // 3. Concatenation
        String s3 = s1 + " " + s2;
        System.out.println("Concatenation: " + s3);

        // concat()
        System.out.println("Using concat(): " + s1.concat(" Java"));

        // 4. Character Extraction
        System.out.println("charAt(1): " + s1.charAt(1));

        char[] arr = new char[5];
        s1.getChars(0, 5, arr, 0);
        System.out.println("getChars(): " + Arrays.toString(arr));

        byte[] bytes = s1.getBytes();
        System.out.println("getBytes(): " + Arrays.toString(bytes));

        char[] charArray = s1.toCharArray();
        System.out.println("toCharArray(): " + Arrays.toString(charArray));

        // 5. String Comparison
        String s4 = "hello";

        System.out.println("equals(): " + s1.equals(s4));
        System.out.println("equalsIgnoreCase(): " + s1.equalsIgnoreCase(s4));
        System.out.println("compareTo(): " + s1.compareTo(s4));

        System.out.println("startsWith(\"He\"): " + s1.startsWith("He"));
        System.out.println("endsWith(\"lo\"): " + s1.endsWith("lo"));

        System.out.println("regionMatches(): " + s1.regionMatches(0, s4, 0, 3));

        // 6. Searching
        String s5 = "Java Programming";

        System.out.println("indexOf('a'): " + s5.indexOf('a'));
        System.out.println("lastIndexOf('a'): " + s5.lastIndexOf('a'));

        // 7. Modifying String (Immutable - returns new string)
        System.out.println("replace(): " + s5.replace("Java", "Python"));

        System.out.println("substring(5): " + s5.substring(5));
        System.out.println("substring(0,4): " + s5.substring(0, 4));

        System.out.println("trim(): " + "   Hello   ".trim());

        // 8. Case Conversion
        System.out.println("toUpperCase(): " + s5.toUpperCase());
        System.out.println("toLowerCase(): " + s5.toLowerCase());

        // 9. valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("valueOf(): " + numStr);

        // 10. Joining Strings
        String joined = String.join("-", "Java", "is", "fun");
        System.out.println("join(): " + joined);

        // ================================
        // STRINGBUFFER (Mutable)
        // ================================

        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("\n--- StringBuffer ---");

        System.out.println("Initial: " + sb);

        sb.append(" World");
        System.out.println("append(): " + sb);

        sb.insert(5, " Java");
        System.out.println("insert(): " + sb);

        sb.replace(0, 5, "Hi");
        System.out.println("replace(): " + sb);

        sb.delete(0, 2);
        System.out.println("delete(): " + sb);

        sb.reverse();
        System.out.println("reverse(): " + sb);

        System.out.println("capacity(): " + sb.capacity());
        System.out.println("length(): " + sb.length());

        sb.ensureCapacity(50);
        System.out.println("ensureCapacity(): " + sb.capacity());

        sb.setLength(5);
        System.out.println("setLength(): " + sb);

        sb.setCharAt(0, 'X');
        System.out.println("setCharAt(): " + sb);

        System.out.println("charAt(): " + sb.charAt(0));

        // ================================
        // STRINGBUILDER (Faster, not thread-safe)
        // ================================

        StringBuilder sbd = new StringBuilder("Java");

        System.out.println("\n--- StringBuilder ---");

        sbd.append(" Code");
        System.out.println("append(): " + sbd);

        sbd.insert(4, " is");
        System.out.println("insert(): " + sbd);

        sbd.delete(0, 2);
        System.out.println("delete(): " + sbd);

        sbd.reverse();
        System.out.println("reverse(): " + sbd);

        // ================================
        // STRING TOKENIZER
        // ================================

        System.out.println("\n--- StringTokenizer ---");

        String str = "Java,Python,C++";
        StringTokenizer st = new StringTokenizer(str, ",");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}