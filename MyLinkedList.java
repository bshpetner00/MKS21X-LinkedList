public class MyLinkedList {
	private int size;
	private Node start,end;
	public MyLinkedList(int s,Node f,Node l) {
		if (size >= 2) {
			size = s;
			start = f;
			end = l;
		}
		else if (f.equals(l)) {
			size = 1;
			start = f;
			end = l;
		}
	}
	public int size() {
		return size;
	}
	public void add(int value) {
		Node newbie = new Node(value,null,end);
		end.setNext(newbie);
		end = newbie;
		size++;
	}
	public String toString() {
		String output = "{";
		Node i = this.start;
		while (i != null) {
			output += "" + i.getData() + " ";
			i = i.getNextNode();
		}
		return output;
	}
}
