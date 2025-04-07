package java;
class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println("I am thread 1");
            System.out.println("Thread 1 is completed");
    }
}
class MyThread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println("I am thread 2");
            System.out.println("Thread 2 completed");
    }
}
class MyThread3 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println("I am thread 3");
            System.out.println("Thread 3 is completed");
    }
}
public class MyThread {
    public static void main(String[] args) {
        System.out.println("Msin thread is strted");
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        System.out.println("Main thread is exit");
        t1.run();
        t2.run();
        t3.run();
    }
}
