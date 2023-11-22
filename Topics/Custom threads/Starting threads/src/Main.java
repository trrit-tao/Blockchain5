public class Main {

    public static void main(String[] args) {
        Thread a1 = new Thread(new RunnableWorker(), "worker-X");
        Thread a2 = new Thread(new RunnableWorker(), "worker-W");
        Thread a3 = new Thread(new RunnableWorker(), "worker-Z");
        a1.start();
        a2.start();
        a3.start();
    }
}


class RunnableWorker implements Runnable {

    @Override
    public void run() {
        final String name = Thread.currentThread().getName();

        if (name.startsWith("worker-")) {
            System.out.println("too hard calculations...");
        } else {
            return;
        }
    }
}