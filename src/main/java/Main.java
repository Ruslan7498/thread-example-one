import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ThreadGroup mainGroup = new ThreadGroup("mainGroup");
        System.out.println("Создаю потоки:");
        List<MyThread> threadList = Arrays.asList(
                new MyThread(mainGroup, "1"),
                new MyThread(mainGroup, "2"),
                new MyThread(mainGroup, "3"),
                new MyThread(mainGroup, "4")
        );
        for (MyThread myThread : threadList) {
            myThread.start();
        }
        try {
            if (!threadList.isEmpty()) threadList.get(0).sleep(15000);
        } catch (InterruptedException err) {
            err.getMessage();
        }
        System.out.println("Завершаю все потоки:");
        mainGroup.interrupt();
    }
}
