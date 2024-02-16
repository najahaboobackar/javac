public class linkedlist {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public  Node head=null;
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
    public void delete(int data){
        Node temp=head;
        Node prev=null;
        if(temp.next==null && temp.data==data){
            System.out.println(temp.data);
            temp=null;
        }
        else{
            System.out.println("no same elements");
        }
        while(temp.next!=null ){
            prev=temp;
            temp=temp.next;
            if(temp.data==data){
                int y=temp.data;
                prev.next=temp.next;
                System.out.println("the deleted data "+y);
            }
            
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
        li.delete(3);
        li.display();
        System.out.println("after adding 5");
        li.addNode(5);
        li.display();
        linkedlist  di=new linkedlist();
        System.out.println("new object di");
        di.addNode(1);
        di.addNode(2);
        di.display();
        di.delete(1);
        di.delete(1);



    }
    
}
