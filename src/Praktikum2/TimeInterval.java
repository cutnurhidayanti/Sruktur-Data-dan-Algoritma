package Praktikum2;

public class TimeInterval {
    // instance variables - replace the example below with your own
    private long startTime, endTime;
    private long elapsedTime; // Time Interval in milliseconds

    /**
    * Constructor for objects of class TimeInterval
    */
    public TimeInterval(){
    // initialise instance variables
    }

    //method untuk memulai menghitung waktu
    public void startTiming() {
        elapsedTime = 0;
        startTime = System.currentTimeMillis();
    }

    //method untuk mengakhir penghitungan waktu
    public void endTiming() {
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
    }
    
    //method untuk mengembalikan interval waktu
    public double getElapsedTime() {
        return (double) elapsedTime / 1000.0;
    }
}
