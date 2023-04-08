public class Problem8 {
    public static String consistDigit(String s) {
        if (s.length() == 0) {
            return "Yes";
        } else if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
            return consistDigit(s.substring(1));
        } else {
            return "No";
        }
    }
}
