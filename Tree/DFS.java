
//Maximum Depth of Binary Tree

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

class DFS{
    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }

        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);

        return 1+Math.max(leftDepth, rightDepth);
    }

    public static void main(String[] args) {
        //creating tree
        //        1
        //       / \
        //      2   3
        //     /      \
        //    4       5

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.right.right=new TreeNode(5);

        DFS dfs=new DFS();
        int result=dfs.maxDepth(root);

        System.out.println("Max Depth: "+result);
    }
}