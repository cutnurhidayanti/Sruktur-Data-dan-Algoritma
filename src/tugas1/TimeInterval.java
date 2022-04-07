package tugas1;

public class TimeInterval {
    private long startTime, endTime;
    private long elapsedTime; // Time Interval in milliseconds

    /**
     * Constructor for objects of class TimeInterval
     */
    public TimeInterval() {
        // initialise instance variables
    }

    // Method untuk memulai menghitung waktu
    public void startTiming() {
        elapsedTime = 0;
        startTime = System.currentTimeMillis();
    }

    // Method untuk mengakhiri penghitungan waktu
    public void endTiming() {
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
    }

    // Method untuk mengembalikan interval waktu
    public long getElapsedTime() {
        return elapsedTime;
    }
}