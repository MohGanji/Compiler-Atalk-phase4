public class NegativeArrayLengthException extends Exception {
    public NegativeArrayLengthException(int len){
        this._len = len;
    }

    public String getLen(){
        return Integer.toString(_len);
    }

    int _len;
}