class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;

    RunnableDemo (String name){
        threadName=name;
    System.out.println("Creating "+ threadName);
    }
    public void run(){
        System.out.println("Running "+threadName);
        try{
            for(int i=4;i>0;i--){
                System.out.println("Thread "+threadName+", "+i);
                Thread.sleep(50);
            }
        }
        catch(InterruptedException e){
            System.out.println("Thread"+threadName+" existing");
        }
        System.out.println("thread"+threadName+"existing");

        }
            
        public void start(){
            System.out.println("Starting "+threadName);
            if(t==null){
                t=new Thread(this,threadName);
                t.start();
            }

        }
    }
    public class Multi{
        public static void main(String[] args){
            RunnableDemo d1=new RunnableDemo("Thread-1");
            d1.start();

            RunnableDemo d2=new RunnableDemo("Thread-2");
            d2.start();
        }
    }
    /*
OUTPUT:
Creating Thread-1
Starting Thread-1
Creating Thread-2
Starting Thread-2
Running Thread-1
Running Thread-2
Thread Thread-2, 4
Thread Thread-1, 4
Thread Thread-2, 3
Thread Thread-1, 3
Thread Thread-2, 2
Thread Thread-1, 2
Thread Thread-2, 1
Thread Thread-1, 1
threadThread-1existing
threadThread-2existing
     */

