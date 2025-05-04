import java.util.*;
public class QueueImp_UsingStack {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    public void push(int x){
        while (s1.empty()==false) {
            s2.push(s1.pop());
        }
        System.out.println("The push elements is "+x);
        s1.push(x);

        while (s2.empty()==false) {
            s1.push(s2.pop());
        }
    }

    public int pop(){
        if(s1.empty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return s1.pop();
    }

    public int peek(){
        if(s1.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return s1.peek();
    }

    public int size(){
        return s1.size();
    }
    public static void main(String[] args) {
       QueueImp_UsingStack s=new QueueImp_UsingStack();
       s.push(1);
       s.push(2); 
       s.push(4);
       System.out.println(s.peek());
       System.out.println(s.pop());
       System.out.println(s.pop());
    }
    
}
