package models;

public class DatabaseConnection {
    private static volatile DatabaseConnection instance;
    private static int creationCount = 0;

    private DatabaseConnection() {
        creationCount++;
        System.out.println("Instance created by " + Thread.currentThread().getName());
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public static int getCreationCount() {
        return creationCount;
    }

    public static void runThreads() throws InterruptedException {
        int threadCount = 10;

        Thread[] threads = new Thread[threadCount];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                DatabaseConnection conn = DatabaseConnection.getInstance();
                System.out.println(Thread.currentThread().getName() + " got instance: " + conn.hashCode());
            });
        }

        for (Thread t: threads) t.start();
        for (Thread t: threads) t.join();

        System.out.println("\n Total times constructor ran: " + DatabaseConnection.getCreationCount());
        System.out.println(DatabaseConnection.getCreationCount() > 1 ? "❌ RACE CONDITION happened!" : "✅ Safe!");
    }

}
