class SimpleCounter {
    public Integer counter = 0;
    private static final SimpleCounter instance = new SimpleCounter();

    private SimpleCounter() {
    }

    public static SimpleCounter getInstance() {
        return instance;
    }
}