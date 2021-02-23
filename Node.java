public class Node {

    public Object data; //存放结点数据值
    public Node next;   //存放后继结点

    //无参构造函数
    public Node(){
        this(null,null);
    }

    //只有结点值的构造函数
    public Node(Object data){
        this.data = data;
    }

    //带所有结点值和后继结点的构造函数
    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}
