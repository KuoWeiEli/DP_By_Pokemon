package interpreter;

/** 8 進制數字解譯器 **/
public class OctalMachine extends Machine {
    @Override
    public void exec(String value) {
        System.out.printf("%s", (char) Integer.parseInt(value, 8));
    }
}
