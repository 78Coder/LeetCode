import java.util.concurrent.atomic.AtomicBoolean;

public class MyT2 extends Thread {
    ThreadLocal<Integer> ans = new ThreadLocal<>();
    InheritableThreadLocal aaa = new InheritableThreadLocal();
    @Override
    public void run() {

        ans.remove();

        for (int i = 0; i < 10000; i++) {
            System.out.println("2  " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
        }
    }
}
