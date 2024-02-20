public class dlinkedlist {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public Node head;
    public Node tail;
    public void addNode(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            tail.next=newnode;
           newnode.prev=tail;
        }
        tail=newnode;
    
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    
    
    public static void main(String[] args) {
        dlinkedlist d=new dlinkedlist();
        d.addNode(2);
        d.addNode(3);
        d.addNode(4);
        d.display();
        
        
    }

    
}
