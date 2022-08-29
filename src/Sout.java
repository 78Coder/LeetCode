class MyThread implements Runnable {
    private String name;
    private Object lock;

    public MyThread(String name, Object lock) {
        this.name = name;
        this.lock=lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
//                lock.notify();
                for (int i = 0; i < 11;) {
//                    lock.wait();
                    System.out.println(name + "," + i);
                    i += 2;
//                    lock.notify();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread2 implements Runnable {
    private String name;
    private Object lock;
    public MyThread2(String name, Object lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {

        synchronized (lock) {
            try {
//                lock.notify();
                for (int i = 1; i < 11;) {
//                    lock.wait();
                    System.out.println(name + "," + i);
                    i += 2;
//                    lock.notify();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

public class Sout {

    public static void main(String[] args) {
        Object o = new Object();
        MyThread t1 = new MyThread("A", o);
        MyThread2 t2 = new MyThread2("B", o);
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
    }
}
