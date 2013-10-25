package by.bsuir.iit.rts.game1.model;

import java.util.ArrayList;
import java.util.List;

public class World {
	private static int	maxID	= 0;

	public static int getNewID() {

		return World.maxID++;
	}

	private final int[][]				map;
	private final List<ActiveObject>	activeObjects;

	public World(final int width, final int height) {

		activeObjects = new ArrayList<ActiveObject>();
		map = new int[height][width];
	}
}
