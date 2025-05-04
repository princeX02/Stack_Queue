import java.util.*;
public class PostFixToPrefix {
    public static String convert(String str){
        Stack<String> stack=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }else{
                String t1=stack.pop();
                String t2=stack.pop();

                String exp=ch+t2+t1;
                stack.push(exp);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String postfix="ab-de+f*/";
        System.out.println("Prefix : "+convert(postfix));
    }
}
