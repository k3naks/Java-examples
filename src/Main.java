import generics.BaseEntity;
import generics.ChildEntity;
import generics.ConcreteImpl;
import generics.GenericClass;
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

    }

    public static void print(List<? extends BaseEntity> list) {
        for (BaseEntity i : list) {
            i.test();
        }
    }

    public static void add(List<? super ChildEntity> list) {
        list.add(new ChildEntity());
    }
}
