public abstract class Type {

	public abstract int size();

	public abstract boolean equals(Object other);

	public abstract String toString();

	public static final int WORD_BYTES = 4; 
	public Integer len() {
		return 1;
	}
}