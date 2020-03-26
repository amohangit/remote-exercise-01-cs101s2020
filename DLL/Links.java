public class Links extends Node {
    private Node head;
    private Node tail;
    private int size;
    public Links() {
      head = null;
      tail = null;
      size = 0;
    } //constructor
    public void addLast(int data){
        Node temp = new Node(data);
        if (head == null){
            /* linked list is empty */
            temp.setNext(null);
            temp.setPrev(null);
            head = temp;
            tail = temp;
        }
        else{
            /* linked list is not empty */
            Node current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(temp);
            temp.setNext(null);
            temp.setPrev(current);
            tail = temp;
        }
        size++;
        
    }
    public void addFront(int data){
        /* add logic here */
    }
    public void displayNodesForward() {
        if(size < 1) {
            //index not valid
            System.out.println("list is empty");
        }
        else{
            Node current = head;
            while(current != null){
                System.out.print(current.getData() + "->");
                current = current.getNext();
            }    
            System.out.print("\n");
        }
    } 
    public void displayNodesReverse() {
        /* add your logic here */
        
    }
    public int getSize(){
        return this.size;
    }
    
    
}