class Solution {
    public String removeKdigits(String num, int k) {

        StringBuilder sb = new StringBuilder(num);

        int i = 0;

        while (i < sb.length() - 1 && k > 0) {

            if (sb.charAt(i) > sb.charAt(i + 1)) {
                sb.deleteCharAt(i);
                k--;

                if (i > 0)
                    i--;      // Previous digit ko dobara check karo
            } else {
                i++;
            }
        }

        while (k > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        if (sb.length() == 0)
            return "0";

        return sb.toString();
    }
}