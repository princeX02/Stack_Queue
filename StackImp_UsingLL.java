public class StackImp_UsingLL {
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static Node top;
    public StackImp_UsingLL(){
        top=null;
    }

    public void push(int x){
        Node newNode=new Node(x);
        newNode.next=top;
        top=newNode;
        System.out.println("The inserted elements is "+x);
    }

    public int pop(){
        if(top==null) {
            System.out.println("Stack UnderFlow ");
            return -1;
        }
        int poped=top.data;
        top=top.next;
        return poped;
    }

    public int peek(){
        if(top==null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    public int size(){
        if(top==null){
            return 0;
        }

        Node head=top;
        int len=0;
        while(head!=null){
            head=head.next;
            len++;
        }
        return len;
    }

    public static void printLL(){
        Node head=top;
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        StackImp_UsingLL stack=new StackImp_UsingLL();
        stack.push(1);
        stack.push(2);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        printLL();
    }
}
