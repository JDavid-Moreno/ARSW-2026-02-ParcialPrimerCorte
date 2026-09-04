package edu.eci.arsw.math;

public class DigitsThread extends Thread {
    private int start;
    private int count;
    private byte[] result;

    public DigitsThread(int start, int count) {
        this.start = start;
        this.count = count;
    }

    @Override
    public void run() {
        result = PiDigits.getDigits(start, count);
    }

    public byte[] getResult() {
        return result;
    }
}
