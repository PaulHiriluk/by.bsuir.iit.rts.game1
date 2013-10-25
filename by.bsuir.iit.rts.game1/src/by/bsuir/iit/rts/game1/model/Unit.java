package by.bsuir.iit.rts.game1.model;

public class Unit extends ActiveObject {
	private int	damage;
	private int	speed;

	public Unit(final int x, final int y, final int width, final int height,
			final int maxDurability, final boolean mechanic, final int damage,
			final int speed) {

		super();
		setCoordinates(x, y);
		setMechanic(mechanic);
		this.damage = damage;
		this.speed = speed;
		setMaxDurability(maxDurability);
	}

	public int getDamage() {

		return damage;
	}

	public int getSpeed() {

		return speed;
	}

	public void setDamage(final int damage) {

		this.damage = damage;
	}

	public void setSpeed(final int speed) {

		this.speed = speed;
	}

}
