import com.Pac1.OperationStage;
import com.Pac1.OperationType;
import com.Pac1.PrintService;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Exchanger;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) throws InterruptedException
    {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Run());
        new Person(cyclicBarrier);
        new Person(cyclicBarrier);
        new Person(cyclicBarrier);

    }
    static class Run extends Thread{
        @Override
        public void run() {
            System.out.println("Собрались то наконец");
        }
    }
    static class Person extends Thread
    {
        CyclicBarrier cyclicBarrier;

        public Person(CyclicBarrier cyclicBarrier) throws InterruptedException {
            this.cyclicBarrier = cyclicBarrier;
           // sleep(1000);
            start();
        }

        @Override
        public void run() {
            try {

                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

}

