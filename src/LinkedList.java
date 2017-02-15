
public class LinkedList {

	//Data 
	Node head;
	int length;
	
	public LinkedList(){
		head = null;
		length = 0;
	}
	
	//insert addSorted method according to initiative
	
	
	public void addToFront(Character c, boolean PC){
		
		Node n = new Node(c, null);
		n.next = head;
		head = n;
		length++;
	}
	
	public boolean addAfter(Character data, Character target){
	
		for(Node tmp=head; tmp!=null; tmp=tmp.next){
			
			if(tmp.c.equals(target)){
				
				Node n = new Node(data, null);
				n.next = tmp.next;
				tmp.next = n;
				length++;
				return true;
			}
		}
		
		return false;
		
	}
	
	public String toString(){
		
		String rv ="";
		for(Node tmp = head; tmp!=null; tmp=tmp.next){
			rv = rv +  tmp.c + "-->"; 
		}
		
		return rv;
	}
	
	/* public static void main(String[] args){
		
		LinkedList mine = new LinkedList();
		mine.addToFront("world");
		mine.addToFront("hello");
		
		mine.addAfter("kitty", "world");
		mine.addToFront("!!!");
		
		System.out.println(mine);
	}
	*/
}
