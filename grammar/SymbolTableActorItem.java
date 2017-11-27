public class SymbolTableActorItem extends SymbolTableItem {
	
	public SymbolTableActorItem(String name, int queueLen) {
        this._name = name;
        this._queueLen = queueLen;
	}
    
    public String getKey(){
        return this._name;
    }
    String _name;
    int _queueLen;
}