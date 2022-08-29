public class Product implements Runnable{

    Integer num;
    @Override
    public void run() {
        while (true) {
            synchronized (num) {
                if (num == 1) {
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("生产1");
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    num = num + 1;
                    num.notify();
                }
            }
        }
    }

    public Product(Integer num) {
        this.num = num;
    }
}
