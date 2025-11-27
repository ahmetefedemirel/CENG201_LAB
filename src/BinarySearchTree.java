public class BinarySearchTree {
    Node root;

    public BinarySearchTree(){
        Node root = null;
    }


    public void insert(int data){
        root = insertRec(root, data);
    }
    Node insertRec(Node root, int data){
        if(root == null){
            return root;
        }
        if(data < root.data){
            root.left = insertRec(root.left, data);
        }
        else if (data > root.data){
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public boolean search(int data){
        return searchRec(root, data);

        boolean searchRec(Node root, int data){
            if(root == null) return false;
            if(root.data == data) return true;

            if(data < root.data){
                return searchRec(root.left, data);
            }
        }
    }

}
