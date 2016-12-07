package fcu.iecs.oop.pokemon;

public class Player {
	
	private String playerName;
	private Pokemon[] pokemons;
	private int level = 1;
	
    public Player(String playerName)
	{
		this.playerName = playerName;
	}
    
    
	public String getPlayerName()
	{
		return playerName;
	}
	
	public void setplayername(String playerName)
	{
		this.playerName = playerName;
	}
	
	public Pokemon[] getPokemons()
	{
		return pokemons;
	}
	
	public void setPokemons(Pokemon[] pokemons)
	{
		this.pokemons = pokemons;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public void setlevel(int level)
	{
		this.level = level;
	}
	
	

}
