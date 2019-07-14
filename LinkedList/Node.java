package LinkedList;

public class Node {
    private String Word;
    private Node next;

    public Node() {
        this.next = null;
    }

    public String getWord() {
        return Word;
    }

    public void setWord(String word) {
        Word = word;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
