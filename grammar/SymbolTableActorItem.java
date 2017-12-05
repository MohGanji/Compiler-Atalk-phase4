public class SymbolTableActorItem extends SymbolTableItem {
	
	public SymbolTableActorItem(String name, int queueLen) {
        this._name = name;
        this._queueLen = queueLen;
	}
    
    public String getKey(){
        return this._name;
    }

    public int getQueueLen(){
        return _queueLen;
    }

    String _name;
    int _queueLen;
}