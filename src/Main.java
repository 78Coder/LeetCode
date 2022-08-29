import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String v4 = in.next();
            String[] split = v4.split("\\.");
            if (split.length > 4) {
                System.out.println("X");
                continue;
            }
            StringBuilder sb = new StringBuilder();
            try {
                for (String s : split) {
                    int sn = Integer.parseInt(s);
                    if (sn > 255) {
                        sb = new StringBuilder("X");
                        break;
                    }
                    if (sn <= 15) {
                        sb.append("0" + Integer.toHexString(sn).toUpperCase());
                        continue;
                    }
                    sb.append(Integer.toHexString(sn).toUpperCase());
                }
            } catch (NumberFormatException e) {
                System.out.println("X");
            }
            System.out.println(sb);
        }
    }
}