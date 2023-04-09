public class Problem8 {
    /**
     * @ consistDigit - a set of statements that checks whether the string consists of digits only
     * @ s - given number
     * @ return - checks whether the string consists of digits only with using recursion if is digit it returns yes if not no

     */
    public static String consistDigit(String s) {
        if (s.length() == 0) { //base case return "yes" if the length of the string is zero
            return "Yes";
        } else if (s.charAt(0) >= '0' && s.charAt(0) <= '9') { //recursive case checks whether every character of the s is a digit
            return consistDigit(s.substring(1));
        } else { // another case it returns "no"
            return "No";
        }
    }
}
