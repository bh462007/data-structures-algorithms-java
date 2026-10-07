//left-root-right

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class Inorder{

    static void inorderRecursion(TreeNode root){
        if(root==null){
            return;
        }

        inorderRecursion(root.left);

        System.out.println(root.data+" ");

        inorderRecursion(root.right);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(8);
        root.left=new TreeNode(4);
        root.right=new TreeNode(12);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(6);
        root.right.left=new TreeNode(10);
        root.right.right=new TreeNode(14);

        System.out.println("Inorder Traversal");
        inorderRecursion(root);
        System.out.println();
    }
}