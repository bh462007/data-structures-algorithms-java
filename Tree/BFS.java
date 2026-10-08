import java.util.*;

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


class BFS{
    static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size=queue.size();

            List<Integer> curr=new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node=queue.poll();
                
                curr.add(node.data);

                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            result.add(curr);
        }


        return result;
    }

    public static void main(String[] args) {

        // Creating the tree:
        //
        //         1
        //       /   \
        //      2     3
        //     / \     \
        //    4   5     6

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(6);

        List<List<Integer>> result = levelOrder(root);

        System.out.println(result);
    }
}