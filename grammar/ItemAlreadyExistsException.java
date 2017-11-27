public class ItemAlreadyExistsException extends Exception {
    public ItemAlreadyExistsException(String name){
        this._name = name;
    }
    public String getName(){
        return _name;
    }
    String _name;
}