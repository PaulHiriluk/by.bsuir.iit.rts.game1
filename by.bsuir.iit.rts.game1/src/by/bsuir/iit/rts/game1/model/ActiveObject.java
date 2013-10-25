package by.bsuir.iit.rts.game1.model;

public class ActiveObject extends Object {
	private static final int	DEFAULT_DURABILITY	= 1000;
	private int					durability;
	private int					maxDurability;
	private boolean				mechanic;
	private boolean				live;

	public ActiveObject() {

		super();
		live = true;
		durability = maxDurability = ActiveObject.DEFAULT_DURABILITY;
		setInvulnerable(false); 
	}

	public int getDurability() {

		return durability;
	}

	public int getMaxDurability() {

		return maxDurability;
	}

	public boolean isLive() {

		return live;
	}

	public boolean isMechanic() {

		return mechanic;
	}

	public void setDurability(final int durability) {

		this.durability = durability;
	}

	public void setLive(final boolean live) {

		this.live = live;
	}

	public void setMaxDurability(final int maxDurability) {

		this.maxDurability = maxDurability;
	}

	public void setMechanic(final boolean mechanic) {

		this.mechanic = mechanic;
	}

}
