public class DeadLock {
    public static void main(String[] args) {
        final  String f="First Resource";
        final  String s="Second Resource";
        Thread th1= new Thread("First Thread"){
            public void run(){
                synchronized(f){
                    System.out.println(this.getName()+"First Resource is Lockes.");
                    try{
                        Thread.sleep(100);
                    }catch(Exception e){

                    }
                    synchronized(s){
                        System.out.println("second resource is locked");
                    }
                }
            }
        };
        Thread th2= new Thread("Second Thread"){
            public void run(){
                synchronized(s){
                    System.out.println(this.getName()+"Second Resource is Locked.");
                    try{
                        Thread.sleep(100);
                    }catch(Exception e){

                    }
                    synchronized(f){
                        System.out.println("First resource is locked");
                    }
                }
            }
        };
        th1.start();
        th2.start();
    }
    
}
