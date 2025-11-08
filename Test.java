public class Test {
    public static void main(String[] args) {
        MyStack newStack = new MyStack();
        newStack.push(14);
        newStack.push(51);
        newStack.push(64);
        newStack.push(67);
        newStack.push(89);

        newStack.pop();
        newStack.pop();

        System.out.println(newStack.middle.data);
    }
}
//