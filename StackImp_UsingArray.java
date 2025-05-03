public class StackImp_UsingArray{
    int arr[];
    int top;
    int size;

    StackImp_UsingArray(){
        top=-1;
        size=1000;
        arr=new int[size];
    }


    public  void push(int x){
        if(top==size-1){
            System.out.println("Stack OverFlow\n"); 
            return ;
        }
        arr[++top]=x;
        System.out.println("Inserted elements is "+x);
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public int size(){
        return top+1;
    }

    public static void main(String[] args) {
        StackImp_UsingArray stack=new StackImp_UsingArray();

        stack.push(1);
        stack.push(2);
        stack.push(4);
        stack.push(5);
        System.out.println("The size is "+stack.size());

        System.out.println("The top elements is " +stack.peek());
        System.out.println("The removed elements is "+stack.pop());
        System.out.println("The size is "+stack.size());

    }
}