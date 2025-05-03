public class QueueImp_UsingArray {
    int arr[];
    int size;
    int currSize;
    int start;
    int end;

    QueueImp_UsingArray(){
        size=10;
        currSize=0;
        arr=new int[size];
        start=-1;
        end=-1;
    }

    public void push(int x){

        if(currSize==size){
            System.out.println("Queue is full");
            return ;
        }

        if(currSize==0){
            start=0;
            end=0;
            arr[end]=x;
            currSize++;

        }else{
            end=(end+1)%size;
            arr[end]=x;
            currSize++;
        }
        System.out.println("The push elements is "+x);
    }

    public int pop(){
        if(currSize==0){
            System.out.println("Queue is empty");
            return -1;
        }

        int ele=arr[start];
        if(currSize==0){
            start=end=-1;
        }else{
            start=(start+1)%size;
        }
        currSize--;
        return ele;
    }

    public int peek(){
        if(currSize==0){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[start];
    }

    public int size(){
        return currSize;
    }

    public static void main(String[] args) {
        QueueImp_UsingArray queue=new QueueImp_UsingArray();
        queue.push(1);
        queue.push(2);
        queue.push(4);
        System.out.println("The removed elements is "+queue.pop());
        System.out.println("The top elements is "+queue.peek());
        System.out.println("The size of queue  is "+queue.size());
    }
}
