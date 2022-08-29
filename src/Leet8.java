public class Leet8 {

    public int myAtoi(String s) {

        int left = 0;
        int right = s.length();
        while (left <= right) {
            if (s.charAt(left) >= '0' && s.charAt(left) <= '9') {
                break;
            }
            left++;
        }
        while (right >= 0) {
            if (s.charAt(right - 1) >= '0' && s.charAt(right - 1) <= '9') {
                break;
            }
            right--;
        }
        boolean min = false;
        if (left > 0 && s.charAt(left - 1) == '-') {
            min = true;
        }
        int i = Integer.parseInt(s.substring(left, right));
        return min ? -i : i;
    }
}
