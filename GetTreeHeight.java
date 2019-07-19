class GetTreeHeight{

  void traverse(TreeNode t){
    while(t!=null){
      traverse(t.left);
      System.out.print(t.data);
      traverse(t.right);
    }
  } 

  int getHeight(TreeNode root){
    if(root==null) return -1;
    return Math.max(getHeight(root.left),getHeight(root.right))+1;
  }

  public static void main(String[] args) {
    TreeNode tree = new TreeNode(A);
    tree.left = new TreeNode(B);
    tree.right = new TreeNode(C);
    tree.left.left = new TreeNode(D);
    tree.left.right = new TreeNode(E);
    tree.right.left = new TreeNode(F);
    tree.right.left.right = new TreeNode(G);

    traverse(A);  
    /*
                  A
            B          C
          D   E     F     *
                  -   G  *  *
    
    */
  }
}

class TreeNode{
  TreeNode left;
  TreeNode right;
  char data;
  TreeNode(char ch){
    data=ch;
  }

}

