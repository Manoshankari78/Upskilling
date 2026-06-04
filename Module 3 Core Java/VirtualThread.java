import java.util.concurrent.CountDownLatch;
public class VirtualThread{
    private static final int tasks=100000;
    public static void main(String[] args) throws InterruptedException{
        long s=System.currentTimeMillis();
        CountDownLatch lat1=new CountDownLatch(tasks);
        for(int i=0;i<tasks;i++){
            int id=i;
            Thread.startVirtualThread(()->{
                if(id%50000==0) System.out.println("Virtual thread message " + id);
                lat1.countDown();
            });
        }
        lat1.await();
        System.out.println("Virtual Thread Time: "+(System.currentTimeMillis()-s)+"ms\n");
        s=System.currentTimeMillis();
        CountDownLatch lat2=new CountDownLatch(tasks);
        try{
            for(int i=0;i<tasks;i++){
                int id=i;
                Thread.ofPlatform().start(()->{
                    if(id%50000==0) System.out.println("Platform thread message " + id);
                    lat2.countDown();
                });
            }
            lat2.await();
            System.out.println("Platform Threads Time: "+(System.currentTimeMillis()-s)+"ms");
        }catch(OutOfMemoryError e){
            System.out.println("Platform threads crashed: Out of memory!");
        }
    }
}
