import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Kryo kryo = new Kryo();
        kryo.register(Wizard.class);
        Input input = new Input(new FileInputStream("data.bin"));
        Wizard deserializedObject = kryo.readObject(input, Wizard.class);
        input.close();
    }

}