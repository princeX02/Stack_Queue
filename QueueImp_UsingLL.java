public class QueueImp_UsingLL {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    private Node font,rear;
    private int size;

    QueueImp_UsingLL(){
        font=null;
        rear=null;
        size=0;
    }

    public void enqueue(int x){
        Node newNode=new Node(x);

        if(rear==null){
            font=rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }
        System.out.println("Inseted elements is "+x);
        size++;
    }

    public int dequeue(){
        if(font==null){
            System.out.println("Queue underflow");
            return -1;
        }
        int removed=font.data;
        font=font.next;
        size--;

        if(font==null){
            rear=null;
        }

        return removed;
    }

    public int peek(){
        if(font==null){
            System.out.println("Queue underflow ,empty");
            return -1;
        }
        return font.data;
    }

    public int QueueSize(){
        return size;
    }

    public  void printLL(){
        if(font==null){
            System.out.println("Queue underflow,empty");
            return ;
        }
        Node temp=font;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        QueueImp_UsingLL queue=new QueueImp_UsingLL();
        queue.enqueue(1);
        queue.enqueue(90);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.QueueSize());
       queue.printLL();
       System.out.println(queue.dequeue());
       System.out.println(queue.dequeue());
    }
}
