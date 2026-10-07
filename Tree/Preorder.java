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


class Preorder{
    static void preorderRecursion(TreeNode root){
        if(root==null){
            return;
        }

        System.out.println(root.data+" ");

        preorderRecursion(root.left);
        preorderRecursion(root.right);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left= new TreeNode(5);
        root.right=new TreeNode(15);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(7);

        System.out.println("Preorder Traversal");

        preorderRecursion(root);
        System.out.println();
    }
}