
public class Node {
	public Character c;
	public Node next;
	public Node(Character c, Node next) {
		this.c = c;
		this.next = next;
	}
	public Node(){
		this.next = null;
	}
	public String toString() {
		return c.name;
	}
	public String toListString(){
		String s = "";
		boolean isFirst = true;
		Node ptr = this;
		while (ptr != null){
			if (isFirst){
				s = ptr.toString();
				isFirst = false;
				ptr = ptr.next;
			}
			s += "->" + ptr.toString();
			ptr = ptr.next;
		}
		return (s);
	}
}
