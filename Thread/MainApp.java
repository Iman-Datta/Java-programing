class MainApp {
    public static void main(String[] args) {
        // Thread t;
        // t = Thread.currentThread();
        // System.out.println(t.getName()+" "+t.getPriority());
        // System.out.println("This is a program that runs main Thread");

        WorkerThread t1 = new WorkerThread();
        System.out.println("Before START: Main thread--> "+t1.getState());

        t1.start();

        System.out.println("After START: Main thread--> "+t1.getState());

        try{
            System.out.println("Main thread is waiting for the child thread to finsh");
            System.out.println("Before JOIN: Main thread--> "+t1.getState());
            t1.join();
            System.out.println("After JOIN: Main thread--> "+t1.getState());
        }catch(Exception e){}
        
        System.out.println("Main thread resumed after child thread finish");
        System.out.println("Main thread terminates");

    }
}

// A thread is a small unit of a program that allows multiple tasks to run at the same time inside a Single program
// JVM starts
// |
// JVM creates the main Thread
// |
// main() method creates the Worker thread