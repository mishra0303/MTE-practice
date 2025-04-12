package Tree;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int val){
        this.data=val;
    }


public static Node InsertionInTree(){
    int x;
    System.out.println("Enter the root val: ");
    Scanner sc=new Scanner(System.in);
    x=sc.nextInt();
    Queue<Node>q=new LinkedList<>();
    Node root=new Node(x);
    q.add(root);
    while(!q.isEmpty()){
        Node temp=q.poll();
        System.out.println("Enter the left child "+temp.data +"of tree");
        int first=sc.nextInt();
        if(first!=-1){
            temp.left=new Node(first);
            q.add(temp.left);
        }
        System.out.println("Enter the right child "+temp.data +"of tree");
        int second=sc.nextInt();
        if(second!=-1){
            temp.right=new Node(second);
            q.add(temp.right);
        }
    }
    return root;
}

public static void display(Node root){
    if(root==null)return;
    System.out.println("(LEVEL ORDER TRAVERSAL)");
    Queue<Node>q=new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        Node temp=q.poll();
        System.out.print(temp.data+"");
        if(temp.left!=null){
            q.add(temp.left);
        }
        if(temp.right!=null){
            q.add(temp.right);
        }
    }
    System.out.println();
}
static void postOrder(Node root){
    if(root==null)return;
   
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data);


}
//deletion of node in binary tree
static void deleteDeepest(Node root,Node dNode){
    Queue<Node>q=new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        Node temp=q.poll();
        if(temp==dNode){
            temp=null;
            
            return;
        }
        if(temp.right!=null){
            if(temp.right==dNode){
                temp.right=null;
            
                return;

            }
            q.add(temp.right);
        }
        if(temp.left!=null){
            if(temp.left==dNode){
                temp.left=null;
            
                return;

            }
            q.add(temp.left);
        }

    }

} 

static Node deletion(Node root,int key){
    if(root==null)return null;
    if(root.left==null&& root.right==null){
        if(root.data==key)return null;
        else{
            return root;
        }
    }
    Queue<Node>q=new LinkedList<>();
    q.add(root);
    Node temp=null;
    Node keyNode=null;
    while(!q.isEmpty()){
        temp=q.poll();
        if(temp.data==key){
            keyNode=temp;
        }
        if(temp.left!=null){
            q.add(temp.left);
        }
        if(temp.right!=null){
            q.add(temp.right);
        }
    }
        if(keyNode!=null){
            
            keyNode.data=temp.data;
            deleteDeepest(root,temp);
        }
        
    
    return root;
}


class TreeImplementation{
    public static void main(String[] args) {
        Node root=InsertionInTree();
        display(root);
        System.out.println("PostOrder Traversal is!");
        postOrder(root);
        System.out.println("Enter the key to delete: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        root = deletion(root, key);
        display(root);

        
        
    }
}
}
