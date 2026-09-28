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
    int idx = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return create( preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public TreeNode create(int preorder[] , int min, int max){

            if (idx == preorder.length) {
            return null;
        }

         if (preorder[idx] < min || preorder[idx] > max) {
            return null;
        }

        
        TreeNode root = new TreeNode(preorder[idx]);
         idx++;
        
        root.left = create( preorder ,min, root.val);
        root.right = create(preorder ,root.val, max);
        return root;
         
    }
   
        
    }
    
