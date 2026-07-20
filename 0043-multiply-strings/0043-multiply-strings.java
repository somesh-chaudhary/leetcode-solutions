class Solution {

    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0"))
            return "0";

        String ans = "0";
        int zeros = 0;

        for (int i = num2.length() - 1; i >= 0; i--) {

            // Multiply num1 with one digit of num2
            String partial = multiplyOneDigit(num1, num2.charAt(i));

            // Add required zeros
            for (int j = 0; j < zeros; j++)
                partial += "0";

            // Add partial product to current answer
            ans = addStrings(ans, partial);

            zeros++;
        }

        return ans;
    }

    // Multiply num with one digit
    private String multiplyOneDigit(String num, char ch) {

        int digit = ch - '0';
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = num.length() - 1; i >= 0; i--) {

            int product = (num.charAt(i) - '0') * digit + carry;

            sb.append(product % 10);
            carry = product / 10;
        }

        if (carry != 0)
            sb.append(carry);

        return sb.reverse().toString();
    }

    // Add two string numbers
    private String addStrings(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            if (i >= 0)
                sum += a.charAt(i--) - '0';

            if (j >= 0)
                sum += b.charAt(j--) - '0';

            sb.append(sum % 10);
            carry = sum / 10;
        }

        return sb.reverse().toString();
    }
}