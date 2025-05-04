import java.util.*;
public class PrefixToPostfix {
    public static String convet(String s){
        Stack<String> stack=new Stack<>();

        for(int i=s.length()-1;i>=0;i--){

            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }else{
                String t1=stack.pop();
                String t2=stack.pop();
                String exp=t1+t2+ch;
                stack.push(exp);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String prefix="/-ab*+def";
        System.out.println(convet(prefix));
    }
}
