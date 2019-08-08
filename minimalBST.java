/**
 * Minimal Tree: Given a sorted (increasing order) array with unique integer elements, write an 
 * algorithm to create a binary search tree with minimal height.
 */

public class MinimalBST{

    public Node createMinimal(int ary[]){
        return createMinimal(ary,0,ary.length-1);
    }

    public Node createMinimal(int ary[], int start, int end){
        
        
        if(end<start) return null;

        int mid = (start+end)/2;

        Node n = new Node(ary[mid]);
        n.left =  createMinimal(ary, start, mid-1);
        n.right = createMinimal(ary, mid+1, end);
        return n;

    }


    public static void main(String[] args) {
    
        /*
        int ele_list[] = new int[5];
        ele_list[0] = 1;        ele_list[1] = 2;        ele_list[2] = 3;        ele_list[3] = 4;        ele_list[4] = 5;
        */

        int ele_list[] = {1,2,3,4,5,6};
        
        Node root = new MinimalBST().createMinimal(ele_list);
        
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
        System.out.println(root.left.right.data);
            System.out.println(root.right.left.data);
        System.out.println(root.right.right.data);

    }

}

class Node{
    int data;
    Node left;
    Node right;
    
    Node(int i){
        data = i;
    }
}

/**
 * 3
 * 1
 * 5
 * 2
 * 4
 * 6
 */