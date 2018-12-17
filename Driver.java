public class Driver {
	public static void main(String[] args) {
    	MyLinkedList list = new MyLinkedList();
    	Node a = new Node (1);
    	Node b = new Node (2);
    	System.out.println(list.toString());
    	list.add(1);
    	System.out.println(list.toString());
    	list.add(2);
		System.out.println(list.toString());
		System.out.println(""+list.get(1));
		System.out.println(""+list.set(1,5));
		System.out.println(list.toString());
		if (list.contains(5)) {
			System.out.println("YUHHH");
		}
		list.add(0,0);
		System.out.println(list.toString());
		list.add(1,7);
		System.out.println(list.toString());
		list.add(2,14);
		System.out.println(list.toString());
  	}
}
