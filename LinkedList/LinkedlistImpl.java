package LinkedList;

public class LinkedlistImpl {

    public static void main (String []args){
        LinkedList linkedList = new LinkedList();
        Node node = new Node();

        node.setWord("First");
        System.out.println(linkedList.addNode(node));


        Node node1 = new Node();
        node1.setWord("Second");

        System.out.println(linkedList.addNode(node1));

        Node node2 = new Node();
        node2.setWord("Third");

        System.out.println(linkedList.addNode(node2));

        System.out.println(linkedList.findNodebyValue("Third"));





    }
}
