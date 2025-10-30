package functional_interface;

public class BackgroundJobExecution {
    public static void main(String[] args) {

        Runnable job1 = () -> System.out.println("Job 1: Data backup is running in background...");
        Runnable job2 = () -> System.out.println("Job 2: Sending notification emails...");
        Runnable job3 = () -> System.out.println("Job 3: Generating daily report...");

        Thread t1 = new Thread(job1);
        Thread t2 = new Thread(job2);
        Thread t3 = new Thread(job3);

        t1.start();
        t2.start();
        t3.start();
    }
}
