public class AdditionUsingStrings {
    public static String main(String[] args) {

        StringBuilder result = new StringBuilder();
        String input1 = null;
        int i = input1.length() - 1;
        CharSequence input2 = null;
        int j = input2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            input1 = "";
            int digit1 = (i >= 0) ? input1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? input2.charAt(j) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.append(sum % 10);
            i--;
            j--;
        }

        return result.reverse().toString();
    }
}

