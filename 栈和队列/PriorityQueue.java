public class PriorityQueue implements IQueue{
    private PriorityNode front;
    private PriorityNode rear;
    public PriorityQueue(){
        front = rear = null;
    }
    @Override
    public void clear(){
        front = rear = null;
    }

    @Override //判断队列是否为空
    public boolean isEmpty(){
        return front == null;
    }

    @Override //返回队列的长度
    public int length(){
        PriorityNode p = front;
        int length = 0;
        while(p != null){
            p = p.next;
            length++;
        }
        return length;
    }

    @Override //读取队首元素并返回其值
    public Object peek() {
        if(isEmpty()){
            return null;
        }
        return front.data;
    }

    @Override//入队
    public void offer(Object x) throws Exception {
        PriorityNode p = new PriorityNode(x);
        if(!isEmpty()){
            rear.next = p;
            rear = p;
        }
        else{
            front = rear = p;
        }
    }

    //入队
    public void offer(Object x, int priority) throws Exception {
        PriorityNode s = new PriorityNode(x,priority);
        if(!isEmpty()){     //如果队列非空
            PriorityNode p = front;
            PriorityNode q = front;
            while(p != null && p.priority <= s.priority){   //按优先级寻找元素所在的位置
                q = p;
                p = p.next;
            }
            //元素位置的三种情况
            if(p == null){  //队尾
                rear.next = s;
                rear = s;
            }
            else if(p == front){    //队首
                s.next = front;
                front = s;
            }
            else{   //队中
                q.next = s;
                s.next = p;
            }
        }
        else{   //队列为空
            front = rear = s;
        }
    }

    @Override //出队
    public Object poll() {
        if((front == null)){
            return null;
        }
        PriorityNode p = front;
        front = front.next;
        if(p == rear){  //删除结点为队尾结点时需要修改rear
            rear = null;
        }
        return p.data;
    }

    @Override//输出队列中的所有数据元素
    public void display() {
        if(!isEmpty()){
            for(PriorityNode p = front; p != null; p = p.next) {
                System.out.print(p.data + " " + p.priority + " ");
            }
        }
        else{
            System.out.print("此队列为空！");
        }
    }
}
