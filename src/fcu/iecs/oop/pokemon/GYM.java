package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM {
	//計算勝場
	static int w1 = 0;
	static int w2 = 0;
	
	public static Player fight(Player...players){
		//將pokemon從矩陣取出
		Player player1 = players[0];
		Player player2 = players[1];
			
		Pokemon[] team1 = player1.getPokemons();
		Pokemon pkm11 = team1[0];
		Pokemon pkm12 = team1[1];
		Pokemon pkm13 = team1[2];
		
		Pokemon[] team2 = player2.getPokemons();
		Pokemon pkm21 = team2[0];
		Pokemon pkm22 = team2[1];
		Pokemon pkm23 = team2[2];
		
		//分別戰鬥
		fight(pkm11, pkm21);
		fight(pkm12, pkm22);
		fight(pkm13, pkm23);
		
		//回傳結果
		if(w1 == 2){
			
			player1.setlevel( player1.getLevel() + 1 );
			System.out.printf("Winner is %s, and his/her level becomes %d.", player1.getPlayerName(), player1.getLevel());
			return player1;
		}
		
		else{
			
			player2.setlevel( player2.getLevel() + 1 );
			System.out.printf("Winner is %s, and his/her level becomes %d.", player2.getPlayerName(), player2.getLevel());
			return player2;
		}
		
	}
	
	
		//分別戰鬥函式
		public static void fight(Pokemon a, Pokemon b){
			
			if(a.getTYPE() == PokemonType.FIRE){
				
				if(b.getTYPE() == PokemonType.WATER){
					
					w2++;
				}
				
				if(b.getTYPE() == PokemonType.GRASS){
					
					w1++;
				}
				
				if(b.getTYPE() == PokemonType.FIRE){
					
					if(a.getCP() > b.getCP()){
						
						w1++;
					}
					
					if(a.getCP() < b.getCP()){
						
						w2++;
					}
					
					if(a.getCP() == b.getCP()){
						
						Random r = new Random();
						
						if(r.nextInt(2)==1){
							w1++;
						}
						else{
							w2++;
						}
					}
				}
			}
			
			if(a.getTYPE() == PokemonType.WATER){
				
				if(b.getTYPE() == PokemonType.GRASS){
					
					w2++;
				}
				
				if(b.getTYPE() == PokemonType.FIRE){
					
					w1++;
				}
				
				if(b.getTYPE() == PokemonType.WATER){
					
					if(a.getCP() > b.getCP()){
						
						w1++;
					}
					
					if(a.getCP() < b.getCP()){
						
						w2++;
					}
					
					if(a.getCP() == b.getCP()){
						
						Random r = new Random();
						
						if(r.nextInt(2)==1){
							w1++;
						}
						else{
							w2++;
						}
					}
				}
			}
			
			if(a.getTYPE() == PokemonType.GRASS){
				
				if(b.getTYPE() == PokemonType.FIRE){
					
					w2++;
				}
				
				if(b.getTYPE() == PokemonType.WATER){
					
					w1++;
				}
				
				if(b.getTYPE() == PokemonType.GRASS){
					
					if(a.getCP() > b.getCP()){
						
						w1++;
					}
					
					if(a.getCP() < b.getCP()){
						
						w2++;
					}
					
					if(a.getCP() == b.getCP()){
						
						Random r = new Random();
						
						if(r.nextInt(2)==1){
							w1++;
						}
						else{
							w2++;
						}
					}
				}
			}
		}
}
