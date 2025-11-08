public class MyStack {
    Node head;
    Node middle;
    int size;

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }


    MyStack(){  // constructor
        this.head = null;
        this.middle = null;
        this.size = 0;
    }


    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
        size++;

        if(size == 1){
            middle = newNode;
        }
        else if(size % 2 != 0){
            middle = middle.prev;
        }
    }
//

    public void pop(){
        if(isEmpty()){
            throw new RuntimeException("Empty stack");
        }
        int popedData = head.data;
        head = head.next;
        if(size % 2 == 0){
            middle = middle.next;
        }
        size--;
    }

}
