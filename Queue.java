class Queue{
    int front;
    int rear;
   int maxSize;
    String arr[];
    Queue(int maxSize)
    {
        this.front=0;
        this.rear=-1;
        this.maxSize=maxSize;
        this.arr=new String[maxSize];
    }
    public boolean isFull()
    {
        if(rear==(maxSize-1))
        return true;
        else
        return false;
    }
    public boolean enqueue(String data)
    {
       if (isFull())
       return false;
       else
       {
           arr[++rear]=data;
           return true;
       }
    }
    public void display(){
    System.out.println("Queue elements:");
    for(int i=0;i<=rear;i++)
    System.out.println(arr[i]);
}
    public boolean isEmpty(){
        if(front>rear)
        return true;
        else
        return false;
    }
    public boolean dequeue(){
        if(isEmpty())
        return false;
        else{
            arr[front++]=null;
            return true;
        }
    }
}
class Swapnil{
    public static void main(String[] args) {
        Queue queue=new Queue(5);
        if(queue.enqueue("Swapnil"))
        System.out.println("Element added");
        else
        System.out.println("Queue full");
        if(queue.enqueue("Kriti"))
        System.out.println("Element added");
        else
        System.out.println("Queue full");
        if(queue.enqueue("Shradhha"))
        System.out.println("Element added");
        else
        System.out.println("Queue full");
        if(queue.enqueue("Ananya"))
        System.out.println("Element added");
        else
        System.out.println("Queue full");
        if(queue.enqueue("Tara"))
        System.out.println("Element added");
        else
        System.out.println("Queue full");
        if(queue.enqueue("Yami"))
        System.out.println("Element added");
        else
        System.out.println("Queue full");
        queue.display();
        if(queue.dequeue())
        System.out.println("Element deleted");
        else
        System.out.println("Queue empty");
        if(queue.dequeue())
        System.out.println("Element deleted");
        else
        System.out.println("Queue empty");
        if(queue.dequeue())
        System.out.println("Element deleted");
        else
        System.out.println("Queue empty");
        if(queue.dequeue())
        System.out.println("Element deleted");
        else
        System.out.println("Queue empty");
        if(queue.dequeue())
        System.out.println("Element deleted");
        else
        System.out.println("Queue empty");
        if(queue.dequeue())
        System.out.println("Element deleted");
        else
        System.out.println("Queue empty");
    }
}