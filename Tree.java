import java.lang.*;
class Tree{

  void inOrderTraverse(TreeNode t){
    if(t!=null){
      inOrderTraverse(t.left);
      System.out.print(t.data);
      inOrderTraverse(t.right);
    }
  } 

  void preOrderTraverse(TreeNode t){
    if(t!=null){ 
      System.out.print(t.data);
      preOrderTraverse(t.left);
      preOrderTraverse(t.right);
    }
  }

  void postOrderTraverse(TreeNode t){
    if(t!=null){
      postOrderTraverse(t.left);
      postOrderTraverse(t.right);
      System.out.print(t.data);
    }
  }

  int getHeight(TreeNode root){     // Root node height is 0 
    if(root==null) return -1;   
    System.out.println(" " + root.data + " "); 
    System.out.print(" ");
    System.out.print(Math.max(getHeight(root.left),getHeight(root.right))+1);
    System.out.println(" ");
    //System.out.print(".. ");
    return Math.max(getHeight(root.left),getHeight(root.right))+1;
  }

  public static void main(String[] args) {
    TreeNode tree = new TreeNode('A');
    tree.left = new TreeNode('B');
    tree.right = new TreeNode('C');
    tree.left.left = new TreeNode('D');
    tree.left.right = new TreeNode('E');
    tree.right.left = new TreeNode('F');
    tree.right.left.right = new TreeNode('G');

    System.out.println("Height");
    System.out.println(new Tree().getHeight(tree));
    /* 
    //    TRAVERSALS 
    System.out.print("Inorder   ");   
    new Tree().inOrderTraverse(tree);
    
    System.out.println(); 
    
    System.out.print("Preorder  ");    
    new Tree().preOrderTraverse(tree);  
    
    System.out.println();
  
    System.out.print("Postorder ");   
    new Tree().postOrderTraverse(tree);  
    */
    

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
    data = ch;
    left = null;
    right = null;
  }

}

