public class Node {
   //Fields
   
   //Specifies data type of elements to be stored as int
   private int element;
   
   //Creates a Node object and calls it next
   private Node next;
   
   //Constructors
   
   //Creates a node with no references to other nodes
   public Node(int e) {
      element = e;
   }
   
   //Creates a node with a reference to another node
   public Node(int e, Node n) {
      element = e;
      next = n;
   }
   
   public static void main(String[] args) {
      Node n;
   
      n = new Node(1, new Node(2));
      n.next.next = new Node(3, null);
      n = new Node(4, n.next);
   }
}
