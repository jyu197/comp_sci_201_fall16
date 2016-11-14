
public class DNode {

	String info;
	DNode next;
	DNode prev;
	DNode(String s, DNode before, DNode after) {
		info = s;
		next = after;
		prev = before;
	}
	
	public DNode addFront(DNode list, String s) {
		list = new DNode(s, null, list);
		if (list.next == null) {
			return list;
		}
		list.next.prev = list;
		return list;
	}
	
	public void print(DNode list) {
		while (list != null) {
			System.out.println(list.info);
			list = list.next;
		}
	}
	
	public void splice(DNode list, String str) {
		DNode current = list;
		while (current.next != null) {
			current.next = addFront(current.next, str);
			current = current.next.next;
		}
		current.next = new DNode(str, list, null);
	}
	
}
