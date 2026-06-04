import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Executor{
    public static void main(String[] args) throws Exception{
        ExecutorService exe=Executors.newFixedThreadPool(3);
        List<Future<String>> future=new ArrayList<>();
        System.out.println("Submitting tasks");
        for(int i=1;i<=5;i++){
            final int taskId=i;
            Callable<String> task=()->{
                Thread.sleep(100);
                return "Result from task "+taskId+"(Executed by " + Thread.currentThread().getName() + ")";
            };
            future.add(exe.submit(task));
        }
        System.out.println("\nCollecting results (blocking via Future.get())...");
        for(Future<String> f:future){
            String res=f.get();
            System.out.println(res);
        }
        exe.shutdown();
    }
}