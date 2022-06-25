import java.util.concurrent.Phaser;


class MyThread implements Runnable {
    Phaser phsr;



    MyThread(Phaser p) {

        phsr = p;
        phsr.register();

        new Thread(this).start();
    }


    public void run() {
        while (!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
            try {

                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}

