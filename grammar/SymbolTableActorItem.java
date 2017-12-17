import java.util.*;
public class SymbolTableActorItem extends SymbolTableItem {
	
	public SymbolTableActorItem(String name, int queueLen) {
        this._name = name;
        this._queueLen = queueLen;
        this._receivers = new HashMap<String, SymbolTableReceiverItem>();
	}
    
    public String getKey(){
        return this._name;
    }

    public int getQueueLen(){
        return this._queueLen;
    }
    public void addReceiver(SymbolTableReceiverItem stri) {
        this._receivers.put(stri.getKey(), stri);
    }
    public void printReceivers() {
        if (this._receivers == null)
            return;
        System.out.println(this._receivers);
    }
    public boolean hasReceiver(String receiverKey) {
        return this._receivers.containsKey(receiverKey);
    }

    String _name;
    int _queueLen;
    HashMap<String, SymbolTableReceiverItem> _receivers;
}