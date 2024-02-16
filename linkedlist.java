public class linkedlist {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static Node head=null;
    public Node tail=null;
    public void addNode(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            tail.next=newNode;
        }
        tail=newNode;


    }
    public  void display(){
        Node temp=head;
        if(head==null){
            System.out.println("empty");
            return ;

        }
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
            
        }

    }
    public static void main(String [] argc){
        linkedlist li=new linkedlist();
        li.display();
        li.addNode(1);
        li.addNode(2);
        li.addNode(3);
        li.addNode(4);
        li.display();



    }
    
}
