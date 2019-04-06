package interpreter;

/** 解譯機器 **/
public abstract class Machine {
    /** 設置石板到解譯機器 **/
    public void interpret(AncientPlate plate) {
        if (plate.getText().length() == 0) return;

        /** 空格所在的位置 **/
        int spaceIndex = plate.getText().indexOf(" ");
        /** 取出數字的部分 **/
        String number = plate.getText().substring(1, spaceIndex);
        /** 將數字進行解譯 **/
        exec(number);
        /** 將已解譯的部分從石板中剃除 **/
        plate.setText(plate.getText().substring(spaceIndex + 1));
    }

    /** 執行 **/
    public abstract void exec(String value);

}
