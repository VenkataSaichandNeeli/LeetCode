class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null) return false;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot) || isSame(root, subRoot); 
    }
    
    private boolean isSame(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null || root1.val != root2.val) return false;
        
        return isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
    }
    
}
