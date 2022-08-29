import java.util.ArrayList;
import java.util.List;

public class Leet01 {

    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (!isSame(ans, words[i])) {
                ans.add(words[i]);
            }
        }
        return ans;
    }

    private boolean isSame(List<String> ans, String word) {
        String last = ans.get(ans.size() - 1);
        if (last.length() != word.length()) {
            return false;
        }
        int[] abc = new int[26];
        for (int i = 0; i < last.length(); i++) {
            abc[last.charAt(i) - 'a']++;
            abc[word.charAt(i) - 'a']--;
        }
        for (int i : abc) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
