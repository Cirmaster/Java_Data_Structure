

public class CircleSqQueue implements IQueue{

    private Object[] queueElem; //队列的储存空间
    private int front;  //指向队首元素
    private int rear;   //指向队尾元素的下一个储存单元
    private int maxSize;    //队列的最大储存单元个数

    //构造最大储存单元个数为maxSize的空队列
    public CircleSqQueue(int maxSize){
        front = rear = 0;
        queueElem = new Override[maxSize];
        this.maxSize = maxSize;
    }
    //将队列清空
    public void clear() {
        front = rear = 0;
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return rear == front;
    }

    //返回队列的长度
    public int length() {
        return (rear - front + maxSize) % maxSize;
    }

    //读取队首元素并返回其值
    public Object peek() {
        if(isEmpty()){
            return null;
        }
        return queueElem[front];
    }

    //入队
    public void offer(Object x) throws Exception {
        if((rear + 1) % maxSize == front){
            throw new Exception("队列已满");
        }
        queueElem[rear] = x;
        rear = (rear + 1) % maxSize;
    }

    //出队
    public Object poll() {
        if(rear == front){
            return null;
        }
        Object p = queueElem[front];
        front = (front + 1) % maxSize;
        return p;
    }

    //输出队列中的所有数据元素
    public void display() {
        if(!isEmpty()){
            for(int i = front; i < rear; i = (i + 1) % maxSize){
                System.out.print(queueElem[i] + " ");
            }
        }
        else{
            System.out.print("此队列为空");
        }
    }
}








