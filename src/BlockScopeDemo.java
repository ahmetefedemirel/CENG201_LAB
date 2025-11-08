public class BlockScopeDemo {
    public static void main(String[] args) {
        int outerX = 5;
        if (outerX > 1) {
            System.out.println("outerX is greater than 1.");
            int innerY = 15;
            System.out.println("Inside if block outerX: " + outerX);
            System.out.println("Inside if block innerY: " + innerY);
        }

        System.out.println("Outside if block outerX: " + outerX);
        //System.out.println("Outside if block innerY: " + innerY); It does not work because innerY is local variable.
    }
}
