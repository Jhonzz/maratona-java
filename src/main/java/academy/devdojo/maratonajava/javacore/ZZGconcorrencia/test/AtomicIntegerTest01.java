package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.atomic.AtomicInteger;

class Counter{
    private int count;
    private AtomicInteger atomicInteger = new AtomicInteger();
    public void increment(){
        count++;
        atomicInteger.incrementAndGet();
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

    public int getCount() {
        return count;
    }
}
public class AtomicIntegerTest01 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
        t1.join(); //ira aguardar rodar a thread
        t2.join(); //ira aguardar rodar a thread
        System.out.println(counter.getCount());
        System.out.println(counter.getAtomicInteger());
    }
}
