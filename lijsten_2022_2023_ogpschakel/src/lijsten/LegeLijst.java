package lijsten;

public class LegeLijst extends Lijst {
	
	public static final LegeLijst INSTANCE = new LegeLijst();
	
	@Override
	public int getLengte() {
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof LegeLijst;
	}
	
	@Override
	public int hashCode() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "[]";
	}

}
