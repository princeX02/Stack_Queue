import java.util.*;

public class ValisParentheses {
    public static boolean isParentheses(String s){
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || 
            s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()) return false;

                char ch=s.charAt(i);
                if((ch==']' && stack.peek()=='[')||
                (ch=='}' && stack.peek()=='{')||
                (ch==')' && stack.peek()=='(')){

                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str="{}[]([])";
        System.out.println(isParentheses(str));
    }
}