public class BinaryTree {
    private DataNode root;

    public BinaryTree()
    {
        root = null;
    }

    public void insert(int key, String data)
    {
        if (root == null)
            root = new DataNode(key, data);
        else
            insert(key, data, root);
    }

    private void insert(int key, String data, DataNode node)
    {
        if (key < node.getKey())
        {
            if (node.getLeft() == null)
                node.setLeft(new DataNode(key, data));
            else
                insert(key, data, node.getLeft());
        }
        else
        {
            if (node.getRight() == null)
                node.setRight(new DataNode(key, data));
            else
                insert(key, data, node.getRight());

        }
    }

    public String inOrder()
    {
        return inOrder(root);
    }
    private String inOrder(DataNode node)
    {
        if (node != null)
        {
            String output = inOrder(node.getLeft());
            output += node.toString() + " ";
            output += inOrder(node.getRight());
            return output;
        }
        else
            return " ";
    }

    public String preOrder()
    {
        return preOrder(root);
    }
    private String preOrder(DataNode node)
    {
        if (node != null)
        {
            String output = node.toString() + " ";
            output += preOrder(node.getLeft());
            output += preOrder(node.getRight());
            return output;
        }
        else
            return " ";
    }
    public String postOrder()
    {
        return postOrder(root);
    }
    private String postOrder(DataNode node)
    {
        if (node != null)
        {
            String output = postOrder(node.getLeft());
            output += postOrder(node.getRight());
            output += node.toString() + " ";
            return output;
        }
        else
            return " ";
    }

    public boolean search(int key)
    {
        return search(key, root);
    }
    private boolean search(int k, DataNode node)
    {
        if (node == null)
            return false;
        else
        {
            if (node.getKey() == k)
                return true;
            else
                if (node.getKey() > k)
                    return search(k, node.getLeft());
                else
                    return search(k, node.getRight());
        }
    }

}
