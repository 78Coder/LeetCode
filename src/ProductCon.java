public class ProductCon implements Runnable{

    Integer num;
    @Override
    public void run() {
        while (true) {
            synchronized (num) {
                if (num == 0) {
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("消费1");
                    num--;
                    num.notify();
                }
            }
        }

    }

    public ProductCon(Integer num) {
        this.num = num;
    }
}
