package models;

public class Randomizer {
    private static int creationCount = 0;
    private static volatile  Randomizer random = null;

    private Randomizer() {
        creationCount++;
        System.out.println("Instance created!");
    }

    public static Randomizer getInstance() {
        if (random == null) {
            random = new Randomizer();
        }

        return random;
    }

    public static int getCreationCount() {
        return creationCount;
    }

    public static void runThreads() throws InterruptedException {
        int threadCount = 10;

        Thread[] threads = new Thread[threadCount];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                Randomizer random = Randomizer.getInstance();
                System.out.println(Thread.currentThread().getName() + " got instance: " + random.hashCode());
            });
        }

        for (Thread t: threads) t.start();
        for (Thread t: threads) t.join();

        System.out.println("\n Total times constructor ran: " + Randomizer.getCreationCount());
        System.out.println(Randomizer.getCreationCount() > 1 ? "❌ RACE CONDITION happened!" : "✅ Safe!");
    }

}
