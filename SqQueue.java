public class SqQueue implements IQueue{

    private Object[] queueElem; //队列的存储区间
    private int front;  //指向队首元素
    private int rear;   //指向队尾元素的下一个储存单元
    private int maxSize;    //队列的最大储存单元个数

    //构造最大储存单元个数为naxSize的空队列
    public SqQueue(int maxSize) {
        front = rear = 0;
        queueElem = new Object[maxSize];
        this.maxSize = maxSize;
    }

    @Override//将队列清空
    public void clear() {
        front = rear = 0;
    }

    @Override//判断队列是否为空
    public boolean isEmpty() {
        return rear == front;
    }

    @Override//返回队列的长度
    public int length() {
        return rear - front;
    }

    @Override//读取队首元素并返回其值
    public Object peek() {
        if(isEmpty()){
            return null;
        }
        return queueElem[front];
    }

    @Override//入队
    public void offer(Object x) throws Exception {
        if(rear == maxSize){
            throw new Exception("队列已满");
        }
        queueElem[rear] = x;
        rear++;
    }

    @Override//出队
    public Object poll() {
        if(rear == front){
            return null;
        }
        Object p = queueElem[front];
        front++;
        return p;
    }

    @Override//输出队列中的所有数据元素
    public void display() {
        if(!isEmpty()){
            for(int i = front; i < rear; i++){
                System.out.print(queueElem[i] + " ");
            }
        }
        else{
            System.out.print("此队列为空");
        }
    }
}










