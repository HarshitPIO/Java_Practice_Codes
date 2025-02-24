package abhyas.dayXII;

import java.util.concurrent.locks.ReentrantLock;

public class DeadlockExample {
    private static final ReentrantLock lock1 = new ReentrantLock();
    private static final ReentrantLock lock2  = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task2());
        thread1.start();
        thread2.start();
    }
    static class Task1 implements Runnable {
        public void run() {
            acquireLocks(lock1,lock2);
            System.out.println("Task1 acquires both locks");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                lock2.unlock();
                lock1.unlock();
            }
        }
    }
    static class Task2 implements Runnable {
        public void run() {
            acquireLocks(lock1,lock2);
            System.out.println("task2 acquires both locks");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }
    private static void acquireLocks(ReentrantLock lock1, ReentrantLock lock2) {
        while(true) {
            boolean gotLock1 = false;
            boolean gotLock2 = false;
            try {
                gotLock1 = lock1.tryLock();
                gotLock2 = lock2.tryLock();
            } finally {
                if(gotLock1 && gotLock2) {
                    return;
                }
                else if (gotLock1) {
                    lock1.unlock();
                }
                else if (gotLock2) {
                    lock2.unlock();
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
