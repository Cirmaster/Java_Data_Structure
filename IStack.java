public interface IStack {
    public void clear();    //将链表置空
    public boolean isEmpty();   //判断栈是否为空
    public int lenght();    //返回栈的数据元素个数
    public Object peek();   //返回栈顶元素
    public void push(Object x); //将数据元素入栈
    public Object pop();    //将栈顶元素出栈并返回
    public void dispaly();  //输出栈中的所有元素
}
