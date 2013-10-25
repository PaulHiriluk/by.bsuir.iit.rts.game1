package by.bsuir.iit.rts.game1.model;

import java.awt.Point;

public class Object {
	private final int	id;
	private Point		coordinates;
	private int			height;
	private int			width;
	boolean				invulnerable;

	public Object() {

		id = World.getNewID();
		coordinates = new Point(-1, -1);
		invulnerable = true;
	}

	public Point getCoordinates() {

		return coordinates;
	}

	public int getHeight() {

		return height;
	}

	public int getId() {

		return id;
	}

	public int getWidth() {

		return width;
	}

	public boolean isInvulnerable() {

		return invulnerable;
	}

	public void setCoordinates(final int x, final int y) {

		coordinates.x = x;
		coordinates.y = y;
	}

	public void setCoordinates(final Point coordinates) {

		this.coordinates = coordinates;
	}

	public void setHeight(final int height) {

		this.height = height;
	}

	public void setInvulnerable(final boolean invulnerable) {

		this.invulnerable = invulnerable;
	}

	public void setWidth(final int width) {

		this.width = width;
	}

}
