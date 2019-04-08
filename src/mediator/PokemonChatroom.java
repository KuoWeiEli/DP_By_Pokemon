package mediator;

/** 寶可夢聊天室 **/
public class PokemonChatroom extends Chatroom {
    @Override
    public void chat(String msg, Member channel, Member player) {
        /** player 為 null 時，代表發送訊息到頻道上 **/
        if (player == null)
            if (channels.contains(channel))
                System.out.printf("發送「%s」到頻道《%s》%n", msg, channel.getName());
            else
                System.out.printf("頻道《%s》不存在！", channel.getName());
        else
            if (players.contains(player))
                System.out.printf("發送「%s」到頻道《%s》中的玩家【%s】%n", msg, channel.getName(), player.getName());
            else
                System.out.printf("不存在玩家【%s】！", player.getName());
    }
}
