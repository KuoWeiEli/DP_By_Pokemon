package iterator;

/** 聚合物件 **/
public abstract class Aggregate {
    /** 取得一個可遍歷此聚集物件的走訪器 **/
    public abstract Iterator createIterator();
    /** 寄存 **/
    public abstract void add(Object obj);
}
