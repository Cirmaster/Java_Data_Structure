
public class LinkStack_s implements IStack {
    private Node top;
    @Override//将栈置空
    public void clear() {
        top = null;
    }

    @Override//判断栈是否为空
    public boolean isEmpty() {
        return top == null;
    }

    @Override//返回栈中数据元素个数
    public int lenght() {
        Node p = top;
        int lenght = 0;
        while(p != null){
            p=p.next;
            lenght++;
        }
        return lenght;
    }

    @Override//返回栈顶元素
    public Object peek() {
        if(!isEmpty()){
            return top.data;
        }
        else{
            return null;
        }
    }

    @Override//入栈
    public void push(Object x) {
        Node s = new Node(x);
        s.next = top;
        top = s;
    }

    @Override//出栈
    public Object pop() {
        if(isEmpty()){
            return null;
        }
        Node p = top;
        top = top.next;
        return p.data;
    }

    @Override//输出栈中所有数据元素
    public void dispaly() {
        Node p = top;
        while(p != null){
            System.out.println(p.data + " ");
            p = p.next;
        }
    }
}
