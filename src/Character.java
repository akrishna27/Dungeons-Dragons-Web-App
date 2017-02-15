import java.util.Random;

public class Character implements Comparable<Character> {
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
	
	public int getInit(){
		return this.init;
	}
	
	public void reveal(){
		this.hidden = false;
	}
	
	public boolean isHidden(){
		return hidden;
	}
	
	@Override//only for initiative atm
	public int compareTo(Character c) {
		if(this.getInit() > c.init){
			return 1;
		}else if (this.getInit() < c.init){
			return -1;
		}else{
			return 0;
		}
	}
	
}
