import java.util.Random;

public class Character {
	private boolean PC;//true if PC, false otherwise
	private boolean hidden;
	public String name;
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
	
	public void SetInitiative(int num){
		init = num;
	}
	
	boolean isHidden(){
		return hidden;
	}
	
}
