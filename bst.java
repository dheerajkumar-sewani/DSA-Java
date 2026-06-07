import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class bst {
    Node root;

    Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);

        return root;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    
    int countNodes(Node root){
        if(root==null)
            return 0;
        
            return 1+countNodes(root.left)+countNodes(root.right);
        
    }

    int height(Node root) {
        if (root==null)
            return 0;
            int leftheight=height(root.left);
            int rightheight=height(root.right);
        
            return 1 + Math.max(leftheight,rightheight);
           
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bst tree = new bst();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            tree.root = tree.insert(tree.root, x);
        }

        System.out.print("\nInorder Traversal: ");
        tree.inorder(tree.root);

        System.out.print("\nPreorder Traversal: ");
        tree.preorder(tree.root);

        System.out.print("\nPostorder Traversal: ");
        tree.postorder(tree.root);

        System.out.print("\nTotal No. of Nodes are"+tree.countNodes(tree.root));

        System.out.print("\nHeight of Tree is"+tree.height(tree.root));

        sc.close();
    }
}