/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftHig = height(root.left);
        int rightHig = height(root.right); 

     return Math.max(leftHig, rightHig) + 1;
   
    }

    public int diameterOfBinaryTree(TreeNode root) {
    if(root == null){
        return 0;
    }
     
     int leftDia = diameterOfBinaryTree(root.left);
     int ritDia = diameterOfBinaryTree(root.right);
     int left = height(root.left);
     int rig = height(root.right);

     int totalHig = left+rig;

     return Math.max(totalHig, Math.max(leftDia, ritDia));

    }
}