package Tree.BinarySearchTree;

import java.util.ArrayList;

public class Implementation {
    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

//    class BST{
//        Node root;
//
//        public void add(int val){
//            Node newNode = new Node(val);
//            if(root == null){
//                root = newNode;
//                return;
//            }
//
//            if(root.left == null){
//                root.left = newNode;
//                return;
//            }
//
//
//        }
//    }


    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static Node searchInBST(Node root, int val) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        }
        if (root.val < val) {
            return searchInBST(root.right, val);
        }
        return searchInBST(root.left, val);
    }


    public static Node insertIntoBST(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (root.val > val) {
//            if(root.left == null)
//            {
//                root.left = new Node(val);
//            }else{
//                insertIntoBST(root.left, val);
//            }
            root.left = insertIntoBST(root.left, val);
        } else if (root.val < val) {
//            if(root.right == null)
//            {
//                root.right = new Node(val);
//            }else{
//                insertIntoBST(root.right, val);
//            }
            root.right = insertIntoBST(root.right, val);
        }
        return root;

    }

    public static void getSortedArray(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        getSortedArray(root.left, list);
        list.add(root.val);
        getSortedArray(root.right, list);
    }

    public static Node deleteNode(Node root, int val) {
        if (root == null) {
            return null;
        }


        if (root.val == val) {
            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            Node predecessor = predecessor(root.left);
            root.val = predecessor.val;
            root.left = deleteNode(root.left, predecessor.val);

        }

        if (root.val < val) {
            root.right = deleteNode(root.right, val);
        } else {
            root.left = deleteNode(root.left, val);
        }
        return root;
    }

    public static Node predecessor(Node root) {
        if(root == null)
        {
            return null;
        }
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }

    public static Node successor(Node root) {
        if(root == null)
        {
            return null;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }


    public static int LCA(Node root,Node a,Node b)
    {
        if(root == null)
        {
            return-1;
        }

        if(a.val < root.val && b.val < root.val)
        {
            return LCA(root.left,a,b);
        }

        if(a.val > root.val && b.val > root.val)
        {
            return LCA(root.right,a,b);
        }

        return root.val;
    }

    public static int[] predAndSuccOfGivenKey(Node root, Node key)
    {
        Node pred = predecessor(key.left);
        Node succ = successor(key.right);

        int[]res = new int[2];
        res[0] = pred!= null?pred.val : -1;
        res[1] = succ!= null?succ.val : -1;

        return res;
    }


    public static void main(String[] args) {
        Node root = new Node(4);
        Node a = new Node(2);
        Node b = new Node(7);
        Node c = new Node(1);
        Node d = new Node(3);
        Node e = new Node(6);
        Node f = new Node(9);

        // Build the tree structure
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;

        System.out.print("Preorder traversal : ");
        preorder(root);
        System.out.println();

        System.out.print("Inorder traversal : ");
        inorder(root);
        System.out.println();

        System.out.print("Postorder traversal : ");
        postorder(root);
        System.out.println();


        System.out.println("<----------------------->");

        Node ans = searchInBST(root, 2);
//        System.out.println(ans);
        Node root1 = insertIntoBST(root, 6);
        System.out.print("Preorder traversal : ");
        preorder(root1);
        System.out.println();

        System.out.print("Inorder traversal : ");
        inorder(root1);
        System.out.println();

        System.out.print("Postorder traversal : ");
        postorder(root1);
        System.out.println();


        ArrayList<Integer> li = new ArrayList<>();
        getSortedArray(root1, li);
        System.out.println(li);

        deleteNode(root1, 7);
        System.out.print("Inorder traversal : ");
        inorder(root1);
        System.out.println();

        System.out.println(LCA(root,a,d));
        int[]res = predAndSuccOfGivenKey(root, b);
        System.out.println("predecessor: " + res[0] + " succ: " + res[1]);



    }
}

