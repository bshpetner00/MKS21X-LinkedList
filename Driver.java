public class Driver {
  public static void main(String[] args) {
    Node a = new Node (1,null,null);
		Node b = new Node (2,null,a);
		a.setNext(b);
		MyLinkedList list = new MyLinkedList(2,a,b);
		System.out.println(list.toString());
  }
}
