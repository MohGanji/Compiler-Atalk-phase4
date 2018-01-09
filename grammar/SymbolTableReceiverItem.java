import java.util.ArrayList;

public class SymbolTableReceiverItem extends SymbolTableItem {
	
	public SymbolTableReceiverItem(String name, ArrayList<Type> types) {
        this._name = name;
        this._types = types;
    }
    
    public ArrayList<Type> getTypes(){
        return _types;
    }
    
    public String getKey(){
        String key = this._name;
        for (Type type : this._types) {
            key += "_" + type.toString();
        }
        return key;
    }

    String _name;
    ArrayList<Type> _types;
}