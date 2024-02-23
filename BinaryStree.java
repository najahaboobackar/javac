public class BinaryStree {
    static class Node {
        int data;
        Node right, left;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    public void Insert(int data) {
        Node current = root;
        if (current == null) {
            root = new Node(data);
            return;
        }
        while (true) {
            if (data < current.data) {
                if (current.left == null) {
                    current.left = new Node(data);
                    break;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = new Node(data);
                    break;
                } else {
                    current = current.right;
                }
            }
        }
    }

    public boolean contains(int data) {
        Node currNode = root;
        while (currNode != null) {
            if (data == currNode.data) {
                return true;
            } else if (data < currNode.data) {
                currNode = currNode.left;
            } else {
                currNode = currNode.right;
            }
        }
        return false;
    }

    public void remove(int data) {
        root = removeHelper(data, root);
    }

    private Node removeHelper(int data, Node current) {
        if (current == null) {
            return null;
        }

        if (data < current.data) {
            current.left = removeHelper(data, current.left);
        } else if (data > current.data) {
            current.right = removeHelper(data, current.right);
        } else {
            if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            } else {
                current.data = getMin(current.right);
                current.right = removeHelper(current.data, current.right);
            }
        }
        return current;
    }

    public int getMin(Node cuNode) {
        if (cuNode.left == null) {
            return cuNode.data;
        } else {
            return getMin(cuNode.left);
        }
    }

    public static void main(String[] argc) {
        BinaryStree b = new BinaryStree();
      
        b.Insert(10);
        b.Insert(8);
        b.Insert(11);
        System.out.println(b.contains(8));
        b.remove(8);
        System.out.println(b.contains(8));
    }
}
