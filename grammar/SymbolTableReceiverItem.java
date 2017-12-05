public class SymbolTableReceiverItem extends SymbolTableItem {
	
	public SymbolTableReceiverItem(String name) {
        this._name = name;
	}
    
    public String getKey(){
        return this._name;
    }
    String _name;
}