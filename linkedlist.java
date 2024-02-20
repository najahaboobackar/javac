public class linkedlist {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("empty");
            return;
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void delete(int data) {
        Node temp = head;
        Node prev = null;
        if (temp != null && temp.data == data) {
            System.out.println("the deleted data " + temp.data);
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("No such element found.");
            return;
        }
        prev.next = temp.next;
        System.out.println("the deleted data " + temp.data);
    }

    public void insertData(int nexto, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.data!=nexto &&temp!=null){
            temp=temp.next;
        }
        if(temp==null){
            return;
        }
        if(temp==tail){
            tail.next=newNode;
            tail=newNode;
            return ;
        }
        else{
        
            newNode.next=temp.next;
            temp.next=newNode;
        }
            
            
        }
        public void duplicateelement(){
            Node current=head;
            while(current!=null){
            Node next=current.next;
            while(next!=null &&next.data==current.data){
                next=next.next;
            }
            current.next=next;
            if(next==tail){
                tail=current;
            }
            current=next;
            }

        }
    

    public static void main(String[] argc) {
        linkedlist li = new linkedlist();
        li.display();
        li.addNode(1);
        li.addNode(2);
        li.addNode(2);
        li.addNode(4);
        li.addNode(5);
        li.addNode(5);
        li.display();
        li.delete(3);
        li.display();
        System.out.println("after adding 5");
        
        li.display();
        li.insertData(1,5);
        System.out.println("after addding 5");
        li.display();
        li.duplicateelement();
        System.out.println("after removuing duplicate");
        li.display();
    }
}
