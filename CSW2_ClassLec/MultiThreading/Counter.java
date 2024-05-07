
public class Counter {
    private int count=0;

    public synchronized void increament(){
        count++;
        System.out.println("Increament count: "+count);

    }
    public synchronized void decreament(){
        count--;
        System.out.println("Decreament count: "+count);
    }
    public synchronized int getCount(){
        System.out.println();
    }
    pu
}
