public class bst {
    
    class Node{
        int data;
        Node r,l;
    
    Node(int data){
        this.data=data;
    }
}
public Node root;
public void insertd(int data){
Node cur=root;
if(cur==null){
    root=new Node( data);
    return;
}
while(true){
 if(data<cur.data){
    if(cur.l==null){
    cur.l=new Node(data);
    break;
}
    else{
        cur=cur.l;
    }
}
else{
    if(cur.r==null){
    cur.r=new Node(data);
    break;
}
else{
    cur=cur.r;
}
}
}
}
public boolean Search(int data){
    Node cur=root;
    while(cur!=null){
    if(data==cur.data){
        return true;
        }
    else if(data<cur.data){
        cur=cur.l;
    }
    else {
        cur=cur.r;
    }
    
   
}
return false;
}// traversing
public void inorder( Node root){
    if (root==null){
        return;
    }
    inorder(root.l);
    System.out.println(root.data);
    inorder(root.r);

}
public void postorder( Node root){
    if (root==null){
        return;
    }
    postorder(root.l);
    postorder(root.r);
    System.out.println(root.data);
}
public void preoder( Node root){
    if (root==null){
        return;
    }
    System.out.println(root.data);
    preoder(root.l);
    preoder(root.r);
    

}
public int findMin(Node cur){
    if (cur.l==null){
        return cur.data;
    }
    else{
        return findMin(cur.l);
    }
}
public void remove(int data){
    Node cur=root;
    removeh(data,cur,null);
}
public Node removeh(int data,Node cur,Node p){
    while(cur!=null){
        if(data<cur.data){
            p=cur;
            cur=cur.l;
        }
        else if(data>cur.data){
            p=cur;
            cur=cur.r;
        }
        else{
            if(cur.l!=null &&cur.r!=null){
                cur.data=getMin(cur.r);
               cur.r= removeh(cur.data, cur.r, cur);
            }
            else{
                if(p==null){
                    if(cur.r==null){
                        root=cur.l;
                    }
                    else{
                        root=cur.r;
                    }
                }
                else{
                    if(p.l==cur){
                        if(cur.r==null){
                            p.l=cur.l;
                        }
                        else{
                            p.l=cur.r;
                        }
                    }
                    else{
                        if(cur.r==null){
                            p.r=cur.l;
                        }
                        else{
                            p.r=cur.r;
                        }
                    }
                }
            }
        }
        break;
    }
    return cur.r;

}
public int getMin(Node cur){
    if(cur.l==null){
        return cur.data;
    }
    else{
        return getMin(cur.l);
    }
}
public static void main(String []argc){
    bst b=new bst();

    b.insertd(12);
    b.insertd(23);
    b.insertd(1);
    b.insertd(3);
    b.insertd(54);
   System.out.println(b.Search(2));
   System.out.println(b.Search(23));
   System.out.println("inorder");
   b.inorder(b.root);
   System.out.println("postorder");
   b.postorder(b.root);    
   System.out.println("preoder");
   b.preoder(b.root);
  b.remove(12);
  b.remove(23);
  b.remove(54);
  b.remove(1);
   System.out.println("after remove");
   b.preoder(b.root);
   b.inorder(b.root);
   
    
}

}


