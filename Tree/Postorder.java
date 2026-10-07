//left-right-root

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class Postorder{
    static void postorderRecursion(TreeNode root){
        if(root==null){
            return;
        }

        postorderRecursion(root.left);
        postorderRecursion(root.right);

        System.out.println(root.data+" ");
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(5);
        root.right=new TreeNode(15);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(7);
        root.right.right=new TreeNode(20);

        System.out.println("Postorder Traversal");
        postorderRecursion(root);
        System.out.println();

    }
}

        