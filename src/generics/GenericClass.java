package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yshybeka on 2/9/2016.
 */
public class GenericClass<E extends BaseInterface> implements GenericInterface<E> {
    @Override
    public List<E> createAndAddToList(E elem) {
        System.out.println("Testing in generic ");
        elem.test();
        List<E> list = new ArrayList<>();
        list.add(elem);
        return list;
    }
}
