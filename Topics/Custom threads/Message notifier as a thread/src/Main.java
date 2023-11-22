class MessageNotifier extends Thread {

    private String message;
    private int num;

    public MessageNotifier(String msg, int repeats) {
        this.message = msg;
        this.num = repeats;
    }

    @Override
    public void run() {
        for (int i = 0; i < num; i++) {
            System.out.println(message);
        }
    }
}