public class Node {
	private int data;
	private Node next,prev;
	public Node(int d) {
		data = d;
	}
	public int getData() {
		return data;
	}
	public Node next() {
		return next;
	}
	public Node prev() {
		return prev;
	}
	public int setData(int d) {
		int old = data;
		data = d;
		return old;
	}
	public void setNext(Node n) {
		next = n;
	}
	public void setPrev(Node p) {
		prev = p;
	}
	public String toString() {
		return "" + data;
	}
}
