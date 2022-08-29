import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet17 {

    List<String> ans = new ArrayList<>();

    StringBuilder sb = new StringBuilder();

    String[] num = new String[]{
      "",
      "",
      "abc",
      "def",
      "ghi",
      "jkl",
      "mno",
      "pqrs",
      "tuv",
      "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return ans;
        }
        comb(digits, 0);
        return ans;
    }

    public void comb(String digits, int start) {
        if (start == digits.length()) {
            ans.add(sb.toString());
            return;
        }
        String str = num[digits.charAt(start) - '0'];
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            comb(digits, start + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
