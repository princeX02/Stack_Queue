import java.util.*;
public class StackImp_UsingQueue {
    Queue<Integer> q=new LinkedList<>();

    public void push(int x){
        q.add(x);
        int size=q.size();
        while(size>1){
            q.add(q.remove());
            size--;
        }
        System.out.println("Elements add is "+x);
    }

    public int pop(){
        if(q.isEmpty()){
            System.out.println("Stack is Underflow");
            return -1;
        }
        return q.remove();
    }
    
    public int peek(){
        if(q.isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return q.peek();
    }

    public int size(){
        return q.size();
    }

    public boolean empty(){
        if(q.size()==0){
            System.out.println("Stack is empty");
            return true;
        }
        System.out.println("Stack is not empty");
        return false;
    }
     
    public static void main(String[] args) {
        StackImp_UsingQueue stack=new StackImp_UsingQueue();
        stack.push(1);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
    }
    
}
