package rimunanda;
/**
 * BTNode2
 */
class BTNode2 {
    BTNode2 left, right;
    int data;

    public BTNode2(){
        left = null;
        right = null;
        data = 0;
    }

    public BTNode2(int item){
        left = null;
        right = null;
        data = item;
    }

    public void setLeft(BTNode2 n) {
        left = n;
    }

    public void setRight(BTNode2 n) {
        right = n;
    }

    /* Function to get left node */
    public BTNode2 getLeft()
    {
        return left;
    }
    /* Function to get right node */
    public BTNode2 getRight()
    {
        return right;
    }
    /* Function to set data to node */
    public void setData(int d)
    {
        data = d;
    }
    /* Function to get data from node */
    public int getData()
    {
        return data;
    }     

}