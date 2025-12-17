// class for cipher
public abstract class Cipher implements Crypto {
    protected String mykey;
    
    public void setKey(String k) throws Exception {
        if (k == null || k.isEmpty()) {
            throw new Exception("key is empty!");
        }
        this.mykey = k;
    }
    
    public boolean hasKey() {
        return mykey != null && !mykey.isEmpty();
    }
}
