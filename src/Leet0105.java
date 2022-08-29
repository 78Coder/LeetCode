public class Leet0105 {

    public boolean oneEditAway(String first, String second) {
        if (Math.abs(first.length() - second.length()) >= 2) {
            return false;
        }
        if (first.length() == second.length()) {
            int time = 0;
            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    time++;
                }
            }
            return time < 2;
        }
        if (first.length() > second.length()) {
            return compare(first, second);
        } else {
            return compare(second, first);
        }
    }

    private boolean compare(String longer, String shorter) {
        for (int i = 0; i < shorter.length(); i++) {
            boolean del = false;
            if (!del && longer.charAt(i) != shorter.charAt(i)) {
                del = true;
            }
            if (del && longer.charAt(i + 1) != shorter.charAt(i)) {
                return false;
            }
        }
        return true;
    }


}
