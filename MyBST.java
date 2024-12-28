public class MyBST {
    public TreeNode mRoot;

    public MyBST(){

    }

    public TreeNode insert(TreeNode root, int value){
        TreeNode newNode = new TreeNode(value);
        //TH1: root == null;
        if(root == null){
            root = newNode;
            return root;
        }else{
            TreeNode temp = root;
            while(true){
                if(value > temp.val){
                    if(temp.right == null){
                        temp.right = newNode;
                        break;
                    }
                    temp = temp.right;
                    
                }else{ //value < temp
                    if(temp.left == null){
                        temp.left = newNode;
                        break;
                    }
                    temp = temp.left;
                }
            }  
        } 
        return root;
    }
}