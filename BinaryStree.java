public class BinaryStree{
    class Node{
        int d;
        Node l,r;
        Node(int d){
            this .d=d;
        }
    }
public   Node root;
    public void I(int data){
        Node c=root;
        if(c==null){
            root=new Node(data);
            return ;

        }
        while(true){
            if(data<c.d){
                if(c.l==null){
                    c.l=new Node(data);
                    break;
                }
                else{
                    c=c.l;
                }
            }
            else {
                if(c.r==null){
                    c.r=new Node(data);
                    break;
                }
                else{
                    c=c.r;
                }
            }
        }

    }
    public boolean S(int d) {
        Node c = root;
        while (c != null) {
            if (d == c.d) {
                return true;
            } else if (d < c.d) {
                c = c.l;
            } else {
                c = c.r;
            }
        }
        return false; // Return false if the value is not found
    }
    public int Gmin(Node c){
        if(c.l==null){
            return c.d;
        }
        else{
            return Gmin(c.l);
        }
    }
    
    public void R(int d){
        Node c=root;
        RH(d,c,null);

    }
    public void RH(int d, Node c, Node p) {
        while (c != null) {
            if (d < c.d) {
                p = c;
                c = c.l;
            } else if (d > c.d) {
                p = c;
                c = c.r;
            } else {
                if (c.l != null && c.r != null) {
                    c.d = Gmin(c.r);
                    RH(c.d, c.r, c);
                } else {
                    if (p == null) {
                        if (c.r == null) {
                            root = c.l;
                        } else {
                            root = c.r;
                        }
                    } else {
                        if (p.l == c) {
                            if (c.r == null) {
                                p.l = c.l;
                            } else {
                                p.l = c.r;
                            }
                        } else {
                            if (c.r == null) {
                                p.r = c.l;
                            } else {
                                p.r = c.r;
                            }
                        }
                    }
                }
                break;
            }
            
        }
    }
    
    
    public static void main(String[] argc) {
        BinaryStree t = new BinaryStree();
        t.I(1);
        t.I(3);
        t.I(4);
        boolean k = t.S(3);
        System.out.println(k);
        t.RH(3, t.root, null); // Perform removal using RH() only
        
        t.R(4);
        k = t.S(1);
        System.out.println(k);
    }
}