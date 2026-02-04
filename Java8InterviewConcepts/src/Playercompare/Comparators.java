package Playercompare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Comparators {
	
	public static void main(String[] args) {
		
		ArrayList<Player> players= new ArrayList<Player>();
		players.add( new Player("Sai", "Thokala", 23));
		players.add(new Player("Shafi", "shik", 23));
		players.add(new Player("Harshi", "Gouda", 23));
		players.add(new Player("keeti", "nampa", 24));
		
		ArrayList<Player> players2=(ArrayList<Player>)players.clone();
		
		
		Comparator<Player> c2= (Player p1 ,Player p2)->p1.getLastname().compareTo(p2.getLastname());
		Collections.sort(players2, c2);
		System.out.print(players2);
				
		
		
		
	}

}
