public class SymbolTableVariableItem extends SymbolTableVariableItemBase {
    public SymbolTableVariableItem(Variable variable, int offset) {
		super(variable, offset);
	}

    @Override
	public Register getBaseRegister(){
        return Register.GP;
    }
}