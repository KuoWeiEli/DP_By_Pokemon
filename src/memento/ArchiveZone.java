package memento;

/** 卡匣記憶區 **/
public class ArchiveZone {
    /** 寶可夢遊戲只能保存一個存檔 **/
    private Archive archive;

    public Archive getArchive() {
        return archive;
    }

    public void setArchive(Archive archive) {
        this.archive = archive;
    }
}
