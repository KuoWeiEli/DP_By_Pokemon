package interpreter;

/** 解譯器模式 - 示範 **/
public class InterpreterDemo {
    public static void main(String[] args) {
        /** 發現一古代石板 **/
        AncientPlate plate = new AncientPlate();
        plate.setText("H70 B1101111 O156 H64 ");

        /** 向瘋狂科學家借了可以解譯古文的機器，
         *  根據讀取到不同的字段，會採用不同的部件進行解譯 **/
        System.out.printf("%s：", "寶藏地點");
        Machine machine = null;
        while (plate.getText().length() > 0) {
            switch (plate.getText().charAt(0)) {
                case 'H':
                    machine = new HexMachine();
                    break;
                case 'O':
                    machine = new OctalMachine();
                    break;
                case 'B':
                    machine = new BinaryMachine();
            }

            machine.interpret(plate);
        }
    }
}
