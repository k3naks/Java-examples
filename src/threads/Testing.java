package threads;

import interfaces.Mockable;
import interfaces.Testable;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by yshybeka on 2/5/2016.
 */
public class Testing implements Testable, Mockable {

    public int counter = 0;

    public Testing(int i) {
        System.out.println("TESTING Constructor");
    }

    @Override
    public void test() {
        System.out.println("testing");
    }

    public void test(int i)  throws Exception {
        System.out.println("int testing " + i);
    }

    public void test(long l) {
        System.out.println("long testing " + l);
    }
}
