package LinkedList;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sun.awt.image.ImageWatched;


import static org.junit.Assert.*;


public class LinkedListTest {
    private LinkedList linkedList = new LinkedList();
    @Test
    public void addNode() {
        LinkedList linkedList = new LinkedList();
        Node head = new Node();
        head.setWord("First");
        String result = linkedList.addNode(head);
        assertEquals("head established as First",result);

        Node next1 = new Node();
         next1.setWord("Second");
        String result2 = linkedList.addNode(next1);
        assertEquals("First-->Second",result2);
    }

    @Before
    public void setUp(){
        Node head = new Node();
        head.setWord("First");
        linkedList.addNode(head);

        Node next1 = new Node();
        next1.setWord("Second");
        linkedList.addNode(next1);

        Node next2 = new Node();
        next2.setWord("Third");
        linkedList.addNode(next2);




    }

    @Test
    public void findnodebyvalue() {
        String result =linkedList.findNodebyValue("First");
        assertEquals("word First is in index number 0",result);

        String result0 =linkedList.findNodebyValue("Second");
        assertEquals("word Second is in index number 1",result0);

        String result1 =linkedList.findNodebyValue("Third");
        assertEquals("word Third is in index number 2",result1);

        String result2 =linkedList.findNodebyValue("None");
        assertEquals("word not found",result2);


    }
    @Test
    public void deleteall(){
        assertEquals("Deleted all component",linkedList.deleteAll());
        assertEquals("Linkedlist already empty",linkedList.deleteAll());
    }

    @Test
    public void lookLinkedlist() {
        assertEquals("First-->Second-->Third",linkedList.lookLinkedlist());
        linkedList.deleteAll();
        assertEquals("linked list empty",linkedList.lookLinkedlist());

    }


    @Test
    public void findNodebyIndex() {
        assertEquals("index number 2 has word Third",linkedList.findNodebyIndex(2));
        assertEquals("Index out of range",linkedList.findNodebyIndex(10));
    }

    @Test
    public void deletenodeatindex() {
        assertEquals("deleted node in index 1",linkedList.deleteNodeatIndex(1));
        assertEquals("First-->Third",linkedList.lookLinkedlist());
        assertEquals("index out of range",linkedList.deleteNodeatIndex(10));
    }

    @Test
    public void deletenodeatword() {
        assertEquals("Node with word Second has been deleted",linkedList.deleteNodeatWord("Second"));
        assertEquals("First-->Third",linkedList.lookLinkedlist());
        assertEquals("Word Fourth not found",linkedList.deleteNodeatWord("Fourth"));
    }


}
