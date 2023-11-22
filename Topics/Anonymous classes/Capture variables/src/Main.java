public class Main {

    public static void main(String[] args) {
        aaa a = new aaa();
        System.out.println(a.action());
Returner s = new aaa();
        System.out.println(s.action());
    }
}

interface Returner {
    default boolean action() {
        String answer = subAction();
        System.out.println(answer);
        return false;
    }

    private String subAction() {
        return "Default action";
    }

    public String returnString();

    public int returnInt();
}

 class aaa implements Returner {

    @Override
    public String returnString() {
        return null;
    }

    @Override
    public int returnInt() {
        return 0;
    }
}
