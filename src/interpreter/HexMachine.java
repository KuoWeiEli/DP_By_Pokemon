package interpreter;

/** 16 進制數字解譯器 */
public class HexMachine extends Machine {
    @Override
    public void exec(String value) {
        System.out.printf("%s", (char) Integer.parseInt(value, 16));
    }
}
