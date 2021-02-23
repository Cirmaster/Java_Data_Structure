public class LinkQueue implements IQueue{
    private Node front; //队首指针
    private Node rear;  //队尾指针

    //构造空队列
    public LinkQueue(){
        front = rear = null;
    }

    @Override//将队列置空
    public void clear() {
        front = rear = null;
    }

    @Override//判断队列是否为空
    public boolean isEmpty() {
        return front == rear;
    }

    @Override//返回队列长度
    public int length() {
        Node p = front;
        int length = 0;
        while(p != null){
            p = p.next;
            length++;
        }
        return length;
    }

    @Override//读取队首元素并返回其值
    public Object peek() {
        if(isEmpty()){
            return null;
        }
        return front.data;
    }

    @Override//入队
    public void offer(Object x) throws Exception {
        Node s = new Node(x);
        if(!isEmpty()){ //如果队列非空
            rear.next = s;
            rear = s;
        }
        else{
            front = rear = s;
        }
    }

    @Override//出队
    public Object poll() {
        if((front == null)){
            return null;
        }
        Node p = front;
        front = front.next;
        if(p == rear){      //删除结点为队尾结点时需要修改rear
            rear = null;
        }
        return p.data;
    }

    @Override//输出队列中的所有数据元素
    public void display() {
        if(!isEmpty()){
            for(Node p = front; p != null; p = p.next){
                System.out.print(p.data + " ");
            }
        }
        else{
            System.out.print("此队列为空");
        }
    }
}










