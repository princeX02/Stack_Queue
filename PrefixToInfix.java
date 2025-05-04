import java.util.*;
public class PrefixToInfix {
    public static String convert(String str){
        Stack<String> stack=new Stack<>();

        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }else{
                String t1=stack.pop();
                String t2=stack.pop();

                String exp="("+t1+ch+t2+")";
                stack.push(exp);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String prefix = "*+pq-mn";
        System.out.println("Infix: " +convert(prefix)); 
    }
}
