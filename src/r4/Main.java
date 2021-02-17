package r4;

public class Main
{
    public static void main(String args[])
    {
        //                                  CHANGE AMOUNT OF THREADS |
        MyExecutorService executorService = new MyExecutorService(1);
        executorService.submit(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Point 1");
        });
        executorService.submit(() -> System.out.println("Point 2"));


    }
}