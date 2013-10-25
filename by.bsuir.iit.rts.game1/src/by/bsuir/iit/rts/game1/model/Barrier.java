package by.bsuir.iit.rts.game1.model;

public class Barrier extends Object {
	private final BarrierType	type;

	public Barrier(final BarrierType type) {

		this.type = type;
	}

	public BarrierType getBarrierType() {

		return type;
	}
}
