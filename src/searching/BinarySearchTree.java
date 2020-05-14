package searching;

public class BinarySearchTree {

    private class Node{
        String key;
        String value;
        Node left;
        Node right;

        Node(String key, String value){
            this.key = key;
            this.value = value;
        }
    }

    private Node root;

    public void put(String key, String value){
        if(root == null){
            root = new Node(key, value);
            return;
        }

        put(root, key, value);
    }

    private void put(Node cn, String key, String value){

        if(key.compareTo(cn.key) < 0){
            if(cn.left == null){
                cn.left = new Node(key, value);
            }else{
                put(cn.left, key, value);
            }
        }else if(key.compareTo(cn.key) > 0){
            if(cn.right == null){
                cn.right = new Node(key, value);
            }else{
                put(cn.right, key, value);
            }
        }else
            cn.value = value;

    }

    public String get(String key){
        Node node = root;
        while(node != null){
            if(key.compareTo(node.key) < 0){
                node = node.left;
            }else if(key.compareTo(node.key) > 0){
                node = node.right;
            }else
                return node.value;
        }

        return null;
    }
}
