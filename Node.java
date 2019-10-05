class Node {
    int data;
    Node left;
    Node right;

    Node(){}
    Node(int x) {
        data = x;
    }

    int left() {
        return left.data;
    }
    
    int right() {
        return right.data;
    }

}