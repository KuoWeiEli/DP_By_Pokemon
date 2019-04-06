package interpreter;

/** 2 進制數字解譯器 **/
public class BinaryMachine extends Machine {
    @Override
    public void exec(String value) {
        System.out.printf("%s", (char) Integer.parseInt(value, 2));
    }
}
