class MyThread extends Thread{
    private String msg;
    public MyThread(String msg){
        this.msg=msg;
    }
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(Thread.currentThread().getName() + ": " + msg);
            try{
                Thread.sleep(100); // Sleep for 2 seconds
            } catch(InterruptedException e){
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
public class MultiThreading{
    public static void main(String[] args){
        Thread t1 = new MyThread("Hello from t1");
        Thread t2 = new MyThread("Hello from t2");
        t1.start();
        t2.start();
    }
}
    

