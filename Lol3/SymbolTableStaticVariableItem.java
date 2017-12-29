public class SymbolTableStaticVariableItem extends SymbolTableVariableItemBase {
	
	public SymbolTableStaticVariableItem(Variable variable, int offset) {
		super(variable, offset);
	}

	@Override
	public Register getBaseRegister() {
		return Register.GP;
	}
}