import java.util.LinkedList;

class LinkedListTry{

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        System.out.println(list.toString());
        System.out.println();
        list.add(2);
        System.out.println(list.toString());
        System.out.println();
        System.out.println(list.peek());        // 1
        System.out.println();

        list.addFirst(5);
        list.addLast(7);
        System.out.println(list.toString());    // [5, 1, 2, 7]
        System.out.println();
        System.out.println(list.peek());        // 5
        System.out.println();

        System.out.println(list.pollFirst());    // 5
        System.out.println(list.toString());    // [1, 2, 7]
        System.out.println();
        System.out.println(list.pollLast());    // 7
        System.out.println(list.toString());    // [1, 2]
        System.out.println();
        

    }
}