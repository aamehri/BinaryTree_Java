import javax.xml.crypto.Data;

public class DataNode {
    //Attributes
    private int key;
    private String data;
    private DataNode left;
    private DataNode right;
    //constructor
    public DataNode(int key, String data)
    {
        this.key = key;
        this.data = data;
    }
    //Accessors
    public String toString()
    {
        return "Key: " + getKey() + " Data: " + getData();
    }
    public DataNode getLeft(){
        return left;
    }

    public DataNode getRight() {
        return right;
    }

    public int getKey(){
        return key;
    }
    public String getData(){
        return data;
    }
    //mutators
    public DataNode setData(int key, String data)
    {
        this.key = key;
        this.data = data;
        return this;
    }
    public DataNode setKey(int key)
    {
        this.key = key;
        return this;
    }
    public DataNode setLeft(DataNode left)
    {
        this.left = left;
        return this;
    }
    public DataNode setRight(DataNode right)
    {
        this.right = right;
        return this;
    }

}
