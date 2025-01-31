package Tree.BinaryTree;

import java.util.ArrayList;

public class ViewsOfTree {

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

    public static void rightViewPreOder(Node root,ArrayList<Integer>ans,int level)
    {
        if(root == null)
        {
            return;
        }

        ans.add(0);
        ans.set(level, root.val);

        rightViewPreOder(root.left,ans,level+1);
        rightViewPreOder(root.right, ans, level+1);

    }
    public static ArrayList<Integer> rightView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();

        rightViewPreOder(root,ans,0);

        return ans;
    }

    public static void leftViewPreOder(Node root,ArrayList<Integer>ans,int level)
    {
        if(root == null)
        {
            return;
        }

        ans.add(0);
        ans.set(level, root.val);


        leftViewPreOder(root.right, ans, level+1);
        leftViewPreOder(root.left,ans,level+1);
    }
    public static ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();

        leftViewPreOder(root,ans,0);

        return ans;
    }


    public static void main(String[] args) {

        Node root = new Node(10);
        Node a1 = new Node(20);
        Node b1 = new Node(30);
        Node c1 = new Node(40);
        Node d1 = new Node(50);
        Node e1 = new Node(60);
        Node f1 = new Node(70);


        root.left = a1;
        root.right = b1;
        a1.left = c1;
        a1.right = d1;
        b1.left = e1;
        b1.right = f1;



        ArrayList<Integer> rView = rightView(root);
        System.out.println("Right View Of tree: "+rView);

        ArrayList<Integer> lView = leftView(root);
        System.out.println("left View Of tree: "+lView);


    }
}
