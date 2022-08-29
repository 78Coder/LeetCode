public class AB {

    public static void main(String[] args) {
        for (int a = 0; a < 100; a++) {
            for (int b = 0; b < 100; b++) {
                for (double x = 0; x < (a + b) * 10; x += 0.01) {
                    double ans = a * Math.sqrt(x * x + b * b - b * x) - 2 * a * b + a * x - b * b + x * x;
                    if (ans <= 0.0000001 && ans >= -0.0000001 && Math.abs(x - b) >= 0.00001) {
                        System.out.println("x=" + x + "     b=" + b);
                    }
                }
            }
        }

    }
}
