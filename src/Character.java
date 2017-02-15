
public class Character {
	private boolean PC;//true if PC, false otherwise
	private boolean hidden;
	private String name;
	private int init;//initiative
	
	public Character(String name, boolean PC){
		this.name = name;
		this.PC = PC;
		if (PC){
			hidden = false;
		}else{
			hidden = true;
		}
	}
	
	
	
}
