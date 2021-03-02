public class PriorityNode {
    public Object data;     //结点的数据域
    public int priority;    //结点的优先级
    public PriorityNode next;
    public PriorityNode(Object x,int priority){
        this.data = x;
        this.priority = priority;
    }
    public PriorityNode(Object x){
        this.data = x;
        this.priority = 1;
    }
}
