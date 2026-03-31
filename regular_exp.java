import java.util.regex.*;

public class regular_exp {

    public static void main(String[] args) {

        String text = "My email is test123@gmail.com and phone is 9876543210. Price: 450Rs";

        // -------------------------------
        // 1. matches() -> Full string validation
        // -------------------------------
        String number = "12345";

        // \\d+ means one or more digits
        if (number.matches("\\d+")) {
            System.out.println("Only digits (matches)");
        } else {
            System.out.println("Not only digits");
        }


        // -------------------------------
        // 2. Pattern + Matcher (Search in text)
        // -------------------------------
        Pattern pattern = Pattern.compile("\\d+"); // find all numbers
        Matcher matcher = pattern.matcher(text);

        System.out.println("\nNumbers found in text:");
        while (matcher.find()) { // find next match
            System.out.println(matcher.group()); // print matched value
        }


        // -------------------------------
        // 3. Extract Email
        // -------------------------------
        Pattern emailPattern = Pattern.compile(
                "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}"
        );
        Matcher emailMatcher = emailPattern.matcher(text);

        if (emailMatcher.find()) {
            System.out.println("\nEmail found: " + emailMatcher.group());
        }


        // -------------------------------
        // 4. Replace (replaceAll)
        // -------------------------------
        // Replace all digits with #
        String replaced = text.replaceAll("\\d", "#");
        System.out.println("\nAfter replacing digits: " + replaced);


        // -------------------------------
        // 5. Split
        // -------------------------------
        String data = "apple,banana,grapes";
        String[] arr = data.split(",");

        System.out.println("\nSplit result:");
        for (String s : arr) {
            System.out.println(s);
        }


        // -------------------------------
        // 6. Count vowels using regex
        // -------------------------------
        String str = "Hello World";
        int vowels = str.replaceAll("[^aeiouAEIOU]", "").length();
        System.out.println("\nVowel count: " + vowels);


        // -------------------------------
        // 7. Anchors (^ and $)
        // -------------------------------
        String startTest = "Java";

        // ^Java -> must start with Java
        if (startTest.matches("^Java")) {
            System.out.println("\nStarts with Java");
        }


        // -------------------------------
        // 8. Case-insensitive matching
        // -------------------------------
        Pattern casePattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        Matcher caseMatcher = casePattern.matcher("JaVa is powerful");

        if (caseMatcher.find()) {
            System.out.println("\nCase-insensitive match found");
        }


        // -------------------------------
        // 9. Grouping ()
        // -------------------------------
        Pattern groupPattern = Pattern.compile("(\\d{3})"); // group of 3 digits
        Matcher groupMatcher = groupPattern.matcher("123456789");

        System.out.println("\nGroups of 3 digits:");
        while (groupMatcher.find()) {
            System.out.println(groupMatcher.group());
        }


        // -------------------------------
        // 10. Greedy vs Lazy
        // -------------------------------
        String greedyTest = "<tag>value1</tag><tag>value2</tag>";

        // Greedy (.*) -> takes maximum match
        Pattern greedy = Pattern.compile("<tag>.*</tag>");
        Matcher greedyMatcher = greedy.matcher(greedyTest);

        if (greedyMatcher.find()) {
            System.out.println("\nGreedy match: " + greedyMatcher.group());
        }

        // Lazy (.*?) -> takes minimum match
        Pattern lazy = Pattern.compile("<tag>.*?</tag>");
        Matcher lazyMatcher = lazy.matcher(greedyTest);

        System.out.println("\nLazy matches:");
        while (lazyMatcher.find()) {
            System.out.println(lazyMatcher.group());
        }


        // -------------------------------
        // 11. Phone validation (10 digits)
        // -------------------------------
        String phone = "9876543210";

        if (phone.matches("\\d{10}")) {
            System.out.println("\nValid phone number");
        } else {
            System.out.println("\nInvalid phone number");
        }
    }
}