/*
Given a non-empty binary tree, find the maximum path sum.

For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. 
The path must contain at least one node and does not need to go through the root.

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    int max_path = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {        
        maxgain(root);
        return max_path;
    }
    
    public int maxgain(TreeNode node) {
    
        if(node==null) return 0;
        
        int left_gain = Math.max(maxgain(node.left),0);
        int right_gain = Math.max(maxgain(node.right),0);
        
        int path = node.val + left_gain + right_gain;
        
        max_path = Math.max(path, max_path);
        
        return node.val + Math.max(left_gain,right_gain);     
    }
    
    
}
