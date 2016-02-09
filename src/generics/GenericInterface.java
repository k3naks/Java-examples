package generics;

import java.util.List;

/**
 * Created by yshybeka on 2/9/2016.
 */
public interface GenericInterface<E extends BaseInterface> {

    List<E> createAndAddToList(E elem);
}
