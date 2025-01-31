package Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Traversal {

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val)
        {
            this.val =val;
            this.left =null;
            this.right =null;
        }
    }

    public static void preOrder(Node root)
    {
        if(root == null)
        {
            return;
        }

        // work
        System.out.print(root.val+" ");

        // call
        preOrder(root.left);

        // call
        preOrder(root.right);

    }

    public static void inOrder(Node root)
    {
        // base case
        if(root == null)
        {
            return;
        }

        //call 1
        inOrder(root.left);

        // work
        System.out.print(root.val+" ");

        // call 2
        inOrder(root.right);
    }

    public static void postOrder(Node root)
    {
        // base case
        if(root == null)
        {
            return;
        }

        //call 1
        postOrder(root.left);

        // call 2
        postOrder(root.right);

        // work
        System.out.print(root.val+" ");
    }

    public static void levelOrder(Node root)
    {
        // define Queue of Node
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty())
        {
            Node temp = q.remove();
            System.out.print(temp.val+" ");

            if(temp.left!=null)
            {
                q.add(temp.left);
            }

            if(temp.right!=null)
            {
                q.add(temp.right);
            }
        }

    }


    public static void main(String[] args) {
        Node root = new Node(10);
        Node a= new Node(20);
        Node b= new Node(30);
        Node c= new Node(40);
        Node d= new Node(50);
        Node e= new Node(60);
        Node f= new Node(70);

        root.left = a;
        root.right =b;

        a.left = c;
        a.right = d;

        b.left = e;
        b.right = f;


        System.out.print("Pre-order: ");
        preOrder(root);
        System.out.println();

        System.out.print("In-order: ");
        inOrder(root);
        System.out.println();


        System.out.print("Post-order: ");
        postOrder(root);
        System.out.println();

        System.out.print("Level-order: ");
        levelOrder(root);
        System.out.println();

    }
}
