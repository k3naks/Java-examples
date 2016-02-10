import generics.*;
import threads.Task;
import threads.Testing;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<BaseEntity> list = (new ConcreteImpl()).createAndAddToList(new ChildEntity());
        add(list);
        print(list);
        // testing branch
        /*Testing t = new Testing(1);
        int threadNumber = 10;
        Thread[] threadArr  =  new Thread[threadNumber];
        for (int i = 0; i < threadNumber; i++) {
            Thread th = new Thread(new Task(i, t));
            threadArr[i] = th;
        }
        for (int i = 0; i < threadNumber; i++) {
            threadArr[i].start();
        }*/

        int a = 3;

        testAnonymus(new BaseInterface() {
            @Override
            public void test() {
                System.out.println(a);
            }

            @Override
            public void test(int i) {

            }
        });

    }

    public static void print(List<? extends BaseEntity> list) {
        for (BaseEntity i : list) {
            i.test();
        }
    }

    public static void add(List<? super ChildEntity> list) {
        list.add(new ChildEntity());
    }

    public static final void testAnonymus(BaseInterface baseInterface) {
        baseInterface.test();
    }
}
