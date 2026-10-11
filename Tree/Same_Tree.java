// Same Tree

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

class Same_Tree{
    public boolean isSameTree(TreeNode p, TreeNode q){
        
        if(p==null && q==null){
            return true;
        }

        if(p==null || q==null){
            return false;
        }

        if(p.data!=q.data){
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }

    public static void main(String[] args) {
        TreeNode p=new TreeNode(1);
        p.left=new TreeNode(2);
        p.right=new TreeNode(3);

        TreeNode q=new TreeNode(1);
        q.left=new TreeNode(2);
        q.right=new TreeNode(3); //change this to 4 for different tree

        Same_Tree same=new Same_Tree();

        if(same.isSameTree(p, q)){
            System.out.println("Both tree are same");
        }
        else{
            System.out.println("Both tree are different");
        }
    }
}