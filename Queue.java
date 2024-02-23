 public class Queue {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public  static Node front=null;
    public static Node rear=null;
    

    public void enqueue(int data){
        Node newnode=new Node(data);
        if( rear==null){
            rear=front=newnode;
        }
        else{
            rear.next=newnode;
            rear=newnode;
            
        }
    }
public void dequeue(){
    if (front==null){
        System.out.println("underflow");
    }
    else{
        System.out.println("data removed is "+front.data);
        front=front.next;
    }
    if(front==null){
        rear=null;
    }
}
public void display(){
    Node curNode=front;
    if(curNode==null){
        System.out.println("empty");
    }
    while(curNode!=null){
        System.out.println(curNode.data);
        curNode=curNode.next;
    }
}
    public static void main(String []argc){
        Queue d=new Queue();
       d.display();
       d.enqueue(1);
       d.display();
       System.out.println("after adding 2");
       d.enqueue(2);
       d.display();
       d.dequeue();
       d.display();
       d.dequeue();
       d.dequeue();

        
    }
}
