import java.util.*;
public class PostfixToInfix {
    public static String convert(String str){
        Stack<String> stack=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }else{
                String a=stack.pop();
                String b=stack.pop();
                String expr="("+b+ch+a+")";
                stack.push(expr);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String postfix = "ab+c*";
        String infix = convert(postfix);
        System.out.println("Infix: " + infix); 
    }
}
