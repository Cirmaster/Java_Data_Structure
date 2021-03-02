public class Hanoi {
    public static void hanoi(int n, char x, char y, char z){
        if(n == 1){
            move(1, x, z);
        }
        else{
            hanoi(n-1, x, z, y);    //将x上序号为1至n-1的圆盘从x移动到y
            move(n, x, z);  //将序号为n的圆盘从塔座x移动到z
            hanoi(n-1, y, x, z);    //将y上序号为1至n-1的圆盘从y移动到z
        }
    }
    public static void move(int n, char x, char z){
        System.out.println("将圆盘：" + n + "从塔座" + x + "移动到塔座" + z +"。");
    }
    public static void main(String[] args){
        hanoi(3, 'x', 'y', 'z');
    }
}
