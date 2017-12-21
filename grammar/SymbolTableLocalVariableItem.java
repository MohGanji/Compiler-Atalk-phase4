public class SymbolTableLocalVariableItem extends SymbolTableVariableItem {
	
	public SymbolTableLocalVariableItem(Variable variable, int offset) {
		super(variable, offset);
	}

	@Override
	public Register getBaseRegister() {
		return Register.SP;
	}

	@Override
	public boolean useMustBeComesAfterDef() {
		return true;
	}
}