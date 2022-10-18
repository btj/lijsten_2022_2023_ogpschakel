package lijsten;

import java.util.Objects;

public class NietLegeLijst extends Lijst {
	
	private final int kop;
	private final Lijst staart;
	
	public NietLegeLijst(int kop, Lijst staart) {
		this.kop = kop;
		this.staart = staart;
	}
	
	@Override
	public int getLengte() {
		return 1 + staart.getLengte();
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof NietLegeLijst nll &&
				kop == nll.kop &&
				staart.equals(nll.staart);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(kop, staart);
	}
	
	@Override
	public String toString() {
		return "[" + kop + (
				staart instanceof LegeLijst ?
					"]"
				:
					", " + staart.toString().substring(1)
				);
	}

}
