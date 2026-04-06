public class WorkerThread extends Thread{

    @Override
    public void run(){
        System.out.println("Child thread started\n");
        try{
            for(int i=1;i<=5;i++){
                System.out.println("Child thread before SLEEP...>  "+i+" "+getState());
                Thread.sleep(3000);
                System.out.println("Child thread after SLEEP...>  "+i+" "+getState());
            }
        }catch(Exception e){}
        System.out.println("\nChild thread finish");
    }
}
