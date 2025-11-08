public class StaticLifetime {
    static int counter = 0;

    public void incrementCounter(){
        counter += 1;
        System.out.println("Incremented counter is " + counter);
    }

    public static void main(String[] args) {
        StaticLifetime obj1 = new StaticLifetime();
        obj1.incrementCounter();
        StaticLifetime obj2 = new StaticLifetime();
        obj2.incrementCounter();
    }
}
