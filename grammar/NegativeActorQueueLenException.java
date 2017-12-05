public class NegativeActorQueueLenException extends Exception {
    public NegativeActorQueueLenException(String name, int queueLen){
        this._name = name;
        this._queueLen = queueLen;
    }
    public String getName(){
        return _name;
    }

    public String getQueueLen(){
        return Integer.toString(_queueLen);
    }
    String _name;
    int _queueLen;
}