public class MyThread extends Thread {
    /*
    public MyThread(String name) {
        super(name);
    }
    */
    public MyThread(ThreadGroup mainGroup, String name) {
        super(mainGroup, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Я поток " + getName() + ". Всем привет!");
            }
        } catch (InterruptedException err) {
            err.getMessage();
        } finally {
            System.out.printf("Поток %s завершен\n", getName());
        }
    }
}
