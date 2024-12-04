import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
    TreeNode() {

    }
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
         this.left = left;
         this.right = right;
    }
 }
public class PWBinaryTree {

    List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root){
        if(root == null){
            return result;
        }
        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);
        return result;
    }

    public List<Integer> preorderTraversal(TreeNode root){
        if(root == null){
            return result;
        }
        result.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return result;
    }

    public List<Integer> postorderTraversal(TreeNode root){
        if(root == null) {
            return result;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        result.add(root.val);
        return result;
    }

}
