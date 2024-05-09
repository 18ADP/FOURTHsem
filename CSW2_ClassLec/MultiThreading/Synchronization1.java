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
/*
OUTPUT:
Increament count: 1
Increament count: 2
Increament count: 3
Increament count: 4
Increament count: 5
Increament count: 6
Increament count: 7
Increament count: 8
Increament count: 9
Increament count: 10
Increament count: 11
Increament count: 12
Increament count: 13
Increament count: 1
Increament count: 15
Increament count: 16
Increament count: 17
Increament count: 18
Increament count: 19
Increament count: 20
 */

