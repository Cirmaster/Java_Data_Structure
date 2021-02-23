public class SqStack_s implements IStack{

    private Object[] stackElem; //顺序栈存储空间
    private int top;    //指向栈顶元素的下一个存储单元位置
    private int maxSize;    //栈的最大储存单元个数

    //构造最大存储单元个数为maxSize的空栈
    public SqStack_s(int maxSize){
        top = 0;
        this.maxSize = maxSize;
        stackElem = new Object[maxSize];
    }

    @Override//将栈置空
    public void clear() {
        top = 0;
    }

    @Override//判断栈是否为空
    public boolean isEmpty() {
        return top == 0;
    }

    @Override//返回数据元素的个数
    public int lenght() {
        return top;
    }

    @Override//返回栈顶元素
    public Object peek() {
        if(isEmpty()){
            return null;
        }
        else{
            return stackElem[top-1];
        }
    }

    @Override//入栈
    public void push(Object x) {
        if(top == maxSize){
            try {
                throw new Exception("栈已满");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        stackElem[top] = x;
        top++;
    }

    @Override//出栈操作
    public Object pop() {
        if(isEmpty()){
            return null;
        }
        top--;
        return stackElem[top];
    }

    @Override//输出栈中的所有数据元素
    public void dispaly() {
        for(int i = top - 1; i>= 0; i--){
            System.out.print(stackElem[i] + " ");
        }
    }
}
