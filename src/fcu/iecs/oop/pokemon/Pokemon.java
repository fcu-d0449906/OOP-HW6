package fcu.iecs.oop.pokemon;

public class Pokemon {
	
	private final String name;
	private final PokemonType type;
	private int cp;
	
	public Pokemon(String name, PokemonType type, int cp){
		this.name = name;
		this.cp = cp;
		this.type = type;
	}
	
	public String getNAME(){
		return name;
	}
	
	public PokemonType getTYPE(){
		return type;
	}
	
	public int getCP(){
		return cp;
	}
	
	public void setCP(int cp){
		this.cp = cp;
	}
	
	
	
}
