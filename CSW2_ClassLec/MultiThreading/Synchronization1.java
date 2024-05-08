class Counter {
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
        System.out.println("Synchronized count : "+ count);
        return count;
        
    }
}
    public class Synchronization1 {
    
        public static void main(String[] args) {
            Counter counter= new Counter();

            Thread th1 = new Thread(() -> {
                for(int i=0;i<10;i++){
                    counter.increament();
                }
            });
            Thread th2=  new Thread(() -> {
                for(int i=0;i<10;i++){
                    counter.increament();
            
        }
    });
    th1.start();
    th2.start();
}
    }

