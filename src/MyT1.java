public class MyT1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            System.out.println("1  " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Thread thread = new Thread(new MyT1());
        Thread myT2 = new MyT2();
        thread.start();
        myT2.start();

        ClassLoader cl = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                return null;
            }
        };
    }
}
