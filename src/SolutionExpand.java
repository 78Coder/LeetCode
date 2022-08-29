public class SolutionExpand {

    public static void main(String[] args) {

        System.out.println(new SolutionExpand().maxString("bb"));
    }

    public String maxString(String s) {
        int maxLength = -1;
        String maxString = "";
        if (s.length() == 1) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;
            while (right < s.length() - 1 && s.charAt(right) == s.charAt(right + 1)) {
                right++;
            }
            while (left > 0 && right < s.length()) {
                if (s.charAt(left) == s.charAt(right)) {
                    left--;
                    right++;
                } else {
                    break;
                }
            }
            if (right - left - 1 > maxLength) {
                maxLength = right - left - 1;
                maxString = s.substring(left + 1, right);
            }
        }
        return maxString;
    }
}
