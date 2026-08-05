package com.vmc.multithreading;

public class PrintSequence {

    int[] evenArray = {2, 4, 6, 8, 10};
    int[] oddArray = {1, 3, 5, 7, 9};
    Object lock = new Object();
    boolean isOddTurn = true;

    public void printEven() {

        for (int i = 0; i < evenArray.length; i++) {
            synchronized (lock) {
                if (isOddTurn) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(evenArray[i]);
                isOddTurn = true;
                lock.notify();
            }
        }

    }

    public void printOdd() {
        for (int i = 0; i < oddArray.length; i++) {
            synchronized (lock) {
                if (!isOddTurn) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(oddArray[i]);
                isOddTurn = false;
                lock.notify();
            }
        }
    }

    public static void main(String[] args) {
        PrintSequence ps = new PrintSequence();
        Thread th = new Thread(ps::printEven);
        th.start();
        Thread th2 = new Thread(ps::printOdd);
        th2.start();
    }
}
