public class ArrayType extends Type {
	
	ArrayType(Type type, int len){
		this._len = len;
		this._type = type;
	}

	public int size() {
		return this._type.size()*this._len;
	}

	@Override
	public boolean equals(Object other) {
		if(other instanceof ArrayType)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "array(" + this._type.toString() + ")";
	}

	int _len;
	Type _type;

}