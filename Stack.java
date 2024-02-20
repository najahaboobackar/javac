public class Stack {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node top; // Changed from public static to private

    public void push(int data) {
        Node newnode = new Node(data);
        if (top == null) {
            top = newnode;
        } else {
            newnode.next = top;
            top = newnode;
        }
    }

    public void display() {
        Node current = top; // Changed from head to top
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public void pop(){
        Node currNode=top;
        if(top==null){
            System.err.println("underflow");
        }
        else{
            System.out.println("the node popped "+currNode.data);
            top=top.next;
        }
        
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();
        s.pop();
        s.display();
    }
}
