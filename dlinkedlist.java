
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
    public void displayrev(){
        Node temp=tail;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.prev;
        }
    }
    public void insertb(int data){
        Node nw1=new Node( data);
        //insert at begining
        nw1.prev=null;
        nw1.next=head;
        head.prev=nw1;
        head=nw1;
    }
    public void insertany(int data,int nextof){
        Node nw=new Node( data);
        Node temp=head;
        while(temp!=null && temp.data!=nextof){
            temp=temp.next;
        }
        if(temp.data==nextof){
            nw.next=temp;
            nw.prev=temp.prev;
            temp.prev.next=nw;
            temp.prev=nw;

        }



    }
    
    public static void main(String[] args) {
        dlinkedlist d=new dlinkedlist();
        d.addNode(2);
        d.addNode(3);
        d.addNode(4);
        d.display();
       
      System.out.println("reversed data");
        d.displayrev();
        System.out.println("new inserted node at begigning");
        d.insertb(6);
        d.display();
        System.err.println("inserted at any pos");
        d.insertany(2, 3);
        d.display();
        System.out.println("reversed");
        d.displayrev();
    }

    
}
    
    
   