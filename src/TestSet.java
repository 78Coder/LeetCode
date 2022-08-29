import java.util.HashMap;

public class TestSet {

    public static void main(String[] args) {
        char[] b1 = {'1','2','3'};
        char[] b2 = {'1','2','3'};
        HashMap<char[], String> map = new HashMap<>();
        map.put(b1, "111");
        map.put(b2, "222");
        System.out.println(map.get(b1));
        System.out.println(map.get(b2));
        System.out.println(map.get(new byte[]{1,2,3}));
    }
}
