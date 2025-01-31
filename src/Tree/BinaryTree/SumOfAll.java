package Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfAll {

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

    public static int treeSum(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int left = treeSum(root.left);
        int right = treeSum(root.right);

        return root.val + left + right;
    }

    public static int sizeOfTree(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        return 1+sizeOfTree(root.left)+sizeOfTree(root.right);
    }

    public static int maxInTree(Node root)
    {
        if(root == null)
        {
            return Integer.MIN_VALUE;
        }

        return Math.max(root.val, Math.max(maxInTree(root.left),maxInTree(root.right)));
    }

    public static int findLevels(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        return 1 + Math.max(findLevels(root.left),findLevels(root.right));
    }

    static int maxDia = Integer.MIN_VALUE;
    public static int findDiameter(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int currDia = levels(root.left) + levels(root.right);

        maxDia = Math.max(currDia,maxDia);

        findDiameter(root.left);
        findDiameter(root.right);

        return maxDia;
    }

    public static int levels(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        return 1+Math.max(levels(root.left),levels(root.right));
    }

    public static boolean isSame(Node r1,Node r2)
    {
        if(r1 == null && r2 == null)
        {
            return true;
        }

        if(r1.val != r2.val)
        {
            return false;
        }

        boolean left = isSame(r1.left,r2.left);
        boolean right = isSame(r1.right,r2.right);

        return left && right;
    }


    public static Node invertBinaryTree(Node root)
    {
        if(root == null)
        {
            return root;
        }

        Node temp = root.right;
        root.right = root.left;
        root.left = temp;

        invertBinaryTree(root.left);
        invertBinaryTree(root.right);

        return root;

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

    public static boolean isExists(Node root,Node target)
    {
        if(root == null)
        {
            return false;
        }
        if(root == target)
        {
            return true;
        }


        if(isExists(root.left, target))
        {
            return true;
        }

        return isExists(root.right, target);
    }

    public static Node lowestCommonAncestor(Node root,Node c1,Node c2)
    {
        if(root == c1 || root == c2)
        {
            return root;
        }

        if(isExists(root.left,c1) && isExists(root.right,c2))
        {
            return root;
        }

        if(isExists(root.left,c2) && isExists(root.right,c1))
        {
            return root;
        }

        if(isExists(root.left,c1) && isExists(root.left,c2))
        {
            return lowestCommonAncestor(root.left, c1, c2);
        }

        return lowestCommonAncestor(root.right, c1, c2);

    }



    public static void main(String[] args) {

        Node root = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);
        Node c = new Node(40);
        Node d = new Node(50);
        Node e = new Node(60);
        Node f = new Node(70);

//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.right = new Node(6);
//        root.left.left.left = new Node(7);


        root.left = a;
        root.right =b;

        a.left = c;
        a.right = d;

        b.left = e;
        b.right = f;


        System.out.println("Tree Sum = "+treeSum(root));
        System.out.println("Size of Tree = "+sizeOfTree(root));
        System.out.println("Maximum Value of Tree = "+maxInTree(root));
        System.out.println("Level of Tree = "+findLevels(root));
        System.out.println("Diameter of Tree = "+findDiameter(root));

        Node root2 = new Node(10);
        Node a2 = new Node(20);
        Node b2 = new Node(30);
        Node c2 = new Node(40);
        Node d2 = new Node(50);
        Node e2 = new Node(60);
        Node f2 = new Node(70);

        root2.left = a2;
        root2.right = b2;
        a2.left = c2;
        a2.right = d2;
        b2.left = e2;
        b2.right = f2;

        System.out.println("Same Tree Status: "+isSame(root,root2));

        System.out.println("Invert Binary Tree: ");
        Node r3 = invertBinaryTree(root);
        levelOrder(r3);


        Node lca = lowestCommonAncestor(root,a,d);
        System.out.println("LCA of Tree: "+lca.val);

    }
}
