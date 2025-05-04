import java.util.*;
public class InfixToPostfix {
    public static int percendence(char ch){
        switch(ch){
            case '+':
            case '-': return 1;
          
            case '*':
            case '/': return 2;
    
            case '^': return 3;

            default : return -1;
        }
    }

    public static  String infixTopostfix(String s){
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }else if( ch=='(' ){
                stack.push(ch);
            }else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    sb.append(stack.pop());
                }
                stack.pop();
            }else{
                while (!stack.isEmpty() && percendence(ch)<= percendence(stack.peek())) {
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String infix="a+(b*c-(d/e^f)*g)*h";
        System.out.println(infixTopostfix(infix));
    }
    
}
