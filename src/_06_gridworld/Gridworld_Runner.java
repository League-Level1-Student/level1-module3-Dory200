package _06_gridworld;

import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld_Runner {
	static World world = new World();
	static Bug bug = new Bug(Color.BLUE);
	static Location place = new Location(5, 4);
	static Location new_place = new Location(5, 3);
	static Location another_place = new Location(5, 5);
	static Location location = new Location(9, 7);
	static Flower flower = new Flower(Color.cyan);
	static Bug bugg = new Bug();
	public static void main(String[] args) {
		world.show();
		world.add(place, bug);
		world.add(location, bugg);
		bug.turn();
		bug.turn();
		world.add(new_place, flower);
		world.add(another_place, flower);
		for(int i = 0; i < 10; i++) {
			
			
			for(int j = 0; j < 10; j++) {
				Location pplace = new Location(i, j);
				
				world.add(pplace, flower);
			}
		}
		
		
	}
}
