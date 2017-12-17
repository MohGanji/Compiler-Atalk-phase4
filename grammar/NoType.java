public class NoType extends Type {
	
	public int size() {
		return 0;
	}

	@Override
	public boolean equals(Object other) {
		if(other instanceof NoType)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "int";
	}

	private static IntType instance;

	public static IntType getInstance() {
		if(instance == null)
			return instance = new IntType();
		return instance;
	}
}