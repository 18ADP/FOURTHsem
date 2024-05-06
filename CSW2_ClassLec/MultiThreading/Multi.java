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

