public class Node {
	private int data;
	private Node next,prev;
	public Node(int d,Node n,Node p) {
		data = d;
		next = n;
		prev = p;
	}
	public int getData() {
		return data;
	}
	public Node getNextNode() {
		return next;
	}
	public Node getLastNode() {
		return prev;
	}
	public void setNext(Node n) {
		next = n;
	}
	public void setLast(Node p) {
		prev = p;
	}
}
