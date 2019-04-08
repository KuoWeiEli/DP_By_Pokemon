package mediator;

/** 仲介者模式 - 示範 **/
public class MediatorDemo {
    public static void main(String[] args) {
        /** 寶可夢聊天室 **/
        Chatroom room = new PokemonChatroom();

        /** 新增頻道1 **/
        Member firstChannel = new Channel("1", room);
        /** 新增 John、Ida **/
        Member john = new Player("John", room);
        Member ida = new Player("Ida", room);

        /** Ida 傳訊息給 John **/
        ida.send("要不要一起去抓皮卡丘？", firstChannel, john);

        /** 頻道一發送公告 **/
        firstChannel.send("頻道二因為出了一點狀況，將臨時關閉！", firstChannel, null);
    }
}
