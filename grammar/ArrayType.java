public class ArrayType extends Type {
	
	ArrayType(Type type, int len){
		this._len = len;
		this._type = type;
		this._dim = type instanceof ArrayType ? ((ArrayType) type).dim() + 1 : 1;
	}

	public int size() {
		return this._type.size()*this._len;
	}

	@Override
	public boolean equals(Object other) {
		if(other instanceof ArrayType && other.toString() == this.toString())
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "array(" + this._type.toString() + ")";
	}

	public int dim() {
		return this._dim;
	}

	int _len;
	Type _type;
	int _dim;
}