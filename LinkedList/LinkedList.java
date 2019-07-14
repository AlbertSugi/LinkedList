package LinkedList;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public String addNode(Node node){
        if(head == null){
            head = node;
            return ("head established as "+ node.getWord());
        }
        Node curr = head;
        String linklist = head.getWord();
        while(curr.getNext()!= null){
            curr = curr.getNext();
            linklist = linklist +"-->"+ curr.getWord();
        }

        curr.setNext(node);
        linklist = linklist+"-->"+curr.getNext().getWord();

        return linklist;

    }
   public String findNodebyValue(String value ){
        try {
            Node curr = head;
            int index = 0;
            while (!curr.getWord().equals(value)) {
                curr = curr.getNext();
                index++;

            }

            return ("word " + curr.getWord() + " is in index number " + index);
        }catch (Exception e)  {

           return ("word not found");
       }
   }

    public String findNodebyIndex(int index ){
        try {
            Node curr = head;
            int currin = 0;
            while (currin != index) {
                curr = curr.getNext();
                currin++;
            }

            return ("index number " + index + " has word " + curr.getWord());
        }catch (Exception e){
            return ("Index out of range");
        }


    }
    public String deleteNodeatIndex(int index){
        try{
            Node curr = head;
            int currin = 0;
            while (currin != (index -1)) {
                curr = curr.getNext();
                currin++;
            }
            curr.setNext(curr.getNext().getNext());
            return("deleted node in index " +index);
        }catch(Exception e){
            return ("index out of range");
        }
    }

    public String deleteNodeatWord(String word){
        try{
            Node curr = head;
            Node before = new Node();
            while(!curr.getWord().equals(word)){
                before = curr;
                curr=curr.getNext();
            }
            before.setNext(curr.getNext());

            return ("Node with word "+word+" has been deleted");
        }catch (Exception e){
            return("Word "+word+" not found");
        }
    }

    public String lookLinkedlist(){

        if(head == null){
            return("linked list empty");
        }
        Node curr = head;
        String linkedlist = head.getWord();
        while(curr.getNext()!=null){
            curr = curr.getNext();
            linkedlist = linkedlist +"-->"+ curr.getWord();
        }

        return linkedlist;
    }

    public String deleteAll(){
        if(head != null) {
            head = null;
            return ("Deleted all component");
        }
            return ("Linkedlist already empty");



    }


}
