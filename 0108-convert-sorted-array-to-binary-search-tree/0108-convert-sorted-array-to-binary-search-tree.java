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
    public TreeNode BST(int[] arr ,int str, int end) {
        if(str > end){
            return null;
        }
        int mid = (str + end)/2;
        
        TreeNode root = new TreeNode(arr[mid]);

        root.left =   BST(arr , str, mid-1);
        root.right = BST(arr , mid+1, end);


        return root;
    }
     public TreeNode sortedArrayToBST(int[] arr) {
        return BST(arr,0, arr.length-1);
     }
}