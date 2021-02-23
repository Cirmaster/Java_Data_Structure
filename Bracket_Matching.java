
class sqstack extends SqStack_s {
    public sqstack(int maxSize) {
        super(maxSize);
    }
    public void isMatched(String str) throws Exception{
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){   //左括号入栈
                push('(');
            }
            else if(str.charAt(i) == ')' && !isEmpty()){    //左括号出栈
                pop();
            }
            else if(str.charAt(i) == ')' && isEmpty()) {  //存在多余的右括号
                System.out.println("括号不匹配！");
                return;
            }
        }
        if(isEmpty()){
            System.out.println("括号匹配！");
        }
        else{
            System.out.print("括号不匹配！！");
        }
    }
}

public class Bracket_Matching {
    public static void main(String[] args) throws Exception{
        String str1 = "(a+b*(c+d))";
        sqstack q = new sqstack(str1.length());
        q.isMatched(str1);
    }
}
